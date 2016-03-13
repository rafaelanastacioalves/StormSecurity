package com.example.rafaelanastacioalves.stormsecurity.domain.interfaces;

import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;

/**
 * Created by rafaelanastacioalves on 12/03/16.
 */
public interface NewsListService {
    void getNews();
    public void onLoadNews(News news);

    }
