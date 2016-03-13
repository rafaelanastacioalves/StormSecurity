package com.example.rafaelanastacioalves.stormsecurity.domain;

import com.example.rafaelanastacioalves.stormsecurity.common.bus.BusProviderImpl;
import com.example.rafaelanastacioalves.stormsecurity.common.bus.interfaces.BusProvider;
import com.example.rafaelanastacioalves.stormsecurity.domain.interfaces.NewsListService;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;
import com.example.rafaelanastacioalves.stormsecurity.model.repository.NewsRepositoryHttpImpl;
import com.example.rafaelanastacioalves.stormsecurity.model.repository.interfaces.NewsRepositoryHttp;
import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;

/**
 * Created by rafaelanastacioalves on 12/03/16.
 */
@EBean
public class NewsListServiceImpl implements NewsListService {
    @Bean(NewsRepositoryHttpImpl.class)
    NewsRepositoryHttp newsRepositoryHttp;
    @Bean(BusProviderImpl.class)
    BusProvider busProvider;

    @Override
    public void getNews() {
        busProvider.getRepositoryBus().register(this);
        newsRepositoryHttp.getNews();
    }

    @Override
    @Subscribe
    @Background
    public void onLoadNews(News news) {
        busProvider.getRepositoryBus().unregister(this);
        busProvider.getServiceBus().post(news);
    }

}
