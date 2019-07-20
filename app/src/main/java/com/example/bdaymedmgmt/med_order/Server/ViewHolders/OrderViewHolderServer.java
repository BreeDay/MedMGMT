package com.example.bdaymedmgmt.med_order.Server.ViewHolders;

import androidx.appcompat.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;

import com.example.bdaymedmgmt.med_order.Common.Common;
import com.example.bdaymedmgmt.med_order.Interface.ItemClickListener;

public class OrderViewHolderServer extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener {

    private ItemClickListener itemClickListener;


    public OrderViewHolderServer(View itemView) {
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
        contextMenu.setHeaderTitle("Select Action");
        contextMenu.add(0, 0, getAdapterPosition(), Common.UPDATE);
        contextMenu.add(0, 1, getAdapterPosition(), Common.DELETE);
    }
}
