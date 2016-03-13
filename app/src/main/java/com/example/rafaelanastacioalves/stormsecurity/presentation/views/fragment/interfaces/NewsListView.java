package com.example.rafaelanastacioalves.stormsecurity.presentation.views.fragment.interfaces;

import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.adapter.NewsListAdapter;

import java.util.List;

/**
 * Created by rafaelanastacioalves on 10/03/16.
 */

public interface NewsListView {
   public NewsListAdapter buildNewListAdapter(List<New> newList);
   public void LoadAllItems(NewsListAdapter newsListAdapter);

   void setupRecyclerView();
}

