package com.example.bdaymedmgmt.med_order.Server.ViewHolders;


import android.view.ContextMenu;
import android.view.View;

import com.example.bdaymedmgmt.med_order.Common.Common;
import com.example.bdaymedmgmt.med_order.Interface.ItemClickListener;

import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolderServer extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener {

    private ItemClickListener itemClickListener;


    public FoodViewHolderServer(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);
    }


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onclick(view, getAdapterPosition(), false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select action");
        contextMenu.add(0, 0, getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0, 1, getAdapterPosition(), Common.DELETE);
    }
}
