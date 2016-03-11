package com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity;

import android.support.v7.app.AppCompatActivity;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.activity.interfaces.NewsView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_news)
public class NewsActivity extends AppCompatActivity implements NewsView {



    @Override
    public void show(){
        int a;
        a=2+3;
    }

    @AfterViews
    void afterViews(){

    }
}
