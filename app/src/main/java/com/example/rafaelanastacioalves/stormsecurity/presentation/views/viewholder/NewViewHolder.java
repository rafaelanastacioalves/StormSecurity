package com.example.rafaelanastacioalves.stormsecurity.presentation.views.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.rafaelanastacioalves.stormsecurity.R;
import com.example.rafaelanastacioalves.stormsecurity.model.entities.New;
import com.example.rafaelanastacioalves.stormsecurity.presentation.views.adapter.interfaces.RecyclerViewClickListener;

/**
 * Created by rafaelanastacioalves on 12/03/16.
 */
public class NewViewHolder extends RecyclerView.ViewHolder  {
    TextView    newText;

    public NewViewHolder(View itemView, RecyclerViewClickListener clickListener) {
        super(itemView);
        newText=(TextView) itemView.findViewById(R.id.new_text_view);
    }
    public void bind(New aNew){

        newText.setText(aNew.getText());
    }
}
