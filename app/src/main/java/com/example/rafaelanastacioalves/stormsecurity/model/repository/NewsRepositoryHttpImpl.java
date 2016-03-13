package com.example.rafaelanastacioalves.stormsecurity.model.repository;


import com.example.rafaelanastacioalves.stormsecurity.common.bus.BusProviderImpl;
import com.example.rafaelanastacioalves.stormsecurity.common.bus.interfaces.BusProvider;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;
import com.example.rafaelanastacioalves.stormsecurity.model.event.HandleHttpFailureEvent;
import com.example.rafaelanastacioalves.stormsecurity.model.repository.interfaces.NewsRepositoryHttp;
import com.example.rafaelanastacioalves.stormsecurity.model.webservice.WebServiceManagerImpl;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by rafaelanastacioalves on 12/03/16.
 */
@EBean
public class NewsRepositoryHttpImpl implements NewsRepositoryHttp {
    @Bean
    WebServiceManagerImpl webServiceManagerImpl;

    @Bean(BusProviderImpl.class)
    BusProvider busProvider;


    @Override
    public void getNews() {
        webServiceManagerImpl.getInstanceWebServiceAPI().getNews(new Callback<News>() {


            @Override
            public void success(News news, Response response) {
                busProvider.getRepositoryBus().post(news);
            }

            @Override
            public void failure(RetrofitError error) {
                busProvider.getRepositoryBus().post(new HandleHttpFailureEvent(error));
            }
        });
    }
}
