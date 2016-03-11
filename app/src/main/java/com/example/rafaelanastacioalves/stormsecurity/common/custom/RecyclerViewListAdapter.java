package com.example.rafaelanastacioalves.stormsecurity.common.custom;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno.vieira on 13/11/15.
 */
public abstract class RecyclerViewListAdapter<VH extends RecyclerView.ViewHolder, I, L> extends RecyclerView.Adapter<VH> {
    private List<I> items = new ArrayList<>();
    private L clickListener;

    @Override
    public VH onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return onCreateItemViewHolder(viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        onBindItemViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return getItems().size();
    }

    protected abstract VH onCreateItemViewHolder(ViewGroup viewGroup, int viewType);

    protected abstract void onBindItemViewHolder(VH holder, int position);

    private boolean hasItems() {
        return items.size() > 0;
    }

    public List<I> getItems() {
        return items;
    }

    public void setItems(List<I> items) {
        this.items = items;
    }

    public L getClickListener() {
        return clickListener;
    }

    public void setClickListener(L clickListener) {
        this.clickListener = clickListener;
    }
}
