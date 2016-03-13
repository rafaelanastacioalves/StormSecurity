package com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity;

import android.support.v7.app.AppCompatActivity;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.NewsPresenterImpl;
import com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.interfaces.NewsPresenter;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity.interfaces.NewsView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_news)
public class NewsActivity extends AppCompatActivity implements NewsView {

    @Bean(NewsPresenterImpl.class)
    NewsPresenter newsPresenter;



    @AfterViews
    void afterViews(){
        newsPresenter.attachView(this);

    }
}
