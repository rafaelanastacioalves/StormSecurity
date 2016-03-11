package com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment;

import android.app.Fragment;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment.interfaces.NewsListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;

/**
 * Created by rafaelanastacioalves on 10/03/16.
 */

@EFragment(R.layout.fragment_news)
public class NewsListFragment extends Fragment implements NewsListView {

    @Override
    public void show(){
        int a;
        a=2+2;
    }

    @AfterViews
    void afterViews(){

    }

}
