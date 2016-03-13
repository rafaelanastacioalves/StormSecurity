package com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment;

import android.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.StormSecurity_;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.NewsPresenterImpl;
import com.example.rafaelanastacioalves.stormsecurity.presentation.presenter.interfaces.NewsPresenter;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.adapter.NewsListAdapter;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment.interfaces.NewsListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by rafaelanastacioalves on 10/03/16.
 */

@EFragment(R.layout.fragment_news)
public class NewsListFragment extends Fragment implements NewsListView {
    @ViewById(R.id.fragment_news_list)
    RecyclerView recyclerView;

    @Bean(NewsPresenterImpl.class)
    NewsPresenter newsPresenter;
    @Bean
    NewsListAdapter newsListAdapter;


    @AfterViews
    void afterViews(){
        newsPresenter.attachView(this);
        setupRecyclerView();
        newsPresenter.loadNews();
    }

    @Override
    public NewsListAdapter buildNewListAdapter(List<New> newList) {
        newsListAdapter.setItems(newList);

        return newsListAdapter;
    }

    @Override
    public void LoadAllItems(NewsListAdapter newsListAdapter) {
        recyclerView.setAdapter(newsListAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        newsListAdapter.notifyDataSetChanged();

    }
    @Override
    public void setupRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(StormSecurity_.getInstance().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
    }

}
