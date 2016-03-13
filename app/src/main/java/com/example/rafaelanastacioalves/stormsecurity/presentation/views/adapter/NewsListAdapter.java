package com.example.rafaelanastacioalves.stormsecurity.presentation.views.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.common.custom.RecyclerViewListAdapter;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.adapter.interfaces.RecyclerViewClickListener;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.viewholder.NewViewHolder;

import org.androidannotations.annotations.EBean;

/**
 * Created by rafaelanastacioalves on 10/03/16.
 */
@EBean
public class NewsListAdapter extends RecyclerViewListAdapter<RecyclerView.ViewHolder,New,RecyclerViewClickListener>{
    @Override
    protected RecyclerView.ViewHolder onCreateItemViewHolder(ViewGroup viewGroup, int viewType) {
        return new NewViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.view_new, viewGroup, false), getClickListener());
    }


    @Override
    protected void onBindItemViewHolder(RecyclerView.ViewHolder holder, int position) {
        New aNewW = getItems().get(position);
        ((NewViewHolder) holder).bind(aNewW);
    }



}
