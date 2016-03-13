package com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.interfaces;

import android.support.annotation.NonNull;

import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity.interfaces.NewsView;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment.interfaces.NewsListView;
import com.squareup.otto.Subscribe;

import java.util.List;

/**
 * Created by rafaelanastacioalves on 12/03/16.
 */
public interface NewsPresenter {

    void attachView(@NonNull NewsView marketOpenListWithTeamView);
    void attachView(@NonNull NewsListView newsListView);
    void loadNews();

    @Subscribe
    void onLoadNews(News news);
    void mountNews(List<New> newList);
}
