package com.example.rafaelanastacioalves.stormsecurity.presentation.presenter;

import android.support.annotation.NonNull;

import com.example.rafaelanastacioalves.stormsecurity.common.bus.BusProviderImpl;
import com.example.rafaelanastacioalves.stormsecurity.common.bus.interfaces.BusProvider;
import com.example.rafaelanastacioalves.stormsecurity.domain.NewsListServiceImpl;
import com.example.rafaelanastacioalves.stormsecurity.domain.interfaces.NewsListService;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;
import com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.interfaces.NewsPresenter;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity.interfaces.NewsView;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment.interfaces.NewsListView;
import com.squareup.otto.Subscribe;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.UiThread;

import java.util.List;

/**
 * Created by rafaelanastacioalves on 09/03/16.
 */
@EBean
public class NewsPresenterImpl implements NewsPresenter{
    NewsView newsView;
    NewsListView newsListView;
    @Bean(NewsListServiceImpl.class)
    NewsListService newsListService;

    @Bean(BusProviderImpl.class)
    BusProvider busProvider;
    @Override
    public void attachView(@NonNull NewsView newsView) {
        this.newsView = newsView;

    }

    @Override
    public void attachView(@NonNull NewsListView newsListView){
        this.newsListView = newsListView;

    }

    @Override
    public void loadNews() {
        busProvider.getServiceBus().register(this);
        newsListService.getNews();
    }

    @Override
    @Subscribe
    @UiThread
    public void onLoadNews(News news) {
        busProvider.getServiceBus().unregister(this);
        mountNews(news.getNewsList());
    }

    @Override
    public void mountNews(List<New> newList) {
        newsListView.LoadAllItems(newsListView.buildNewListAdapter(newList));
    }



}
