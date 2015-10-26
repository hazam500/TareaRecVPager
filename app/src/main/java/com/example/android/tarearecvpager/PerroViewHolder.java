package com.example.android.tarearecvpager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class PerroViewHolder extends RecyclerView.ViewHolder {


    public final ItemClickListener miItemClickListener;
    public final TextView textViewNombre;
    public final ImageView imageView;
    public final TextView latitudTextView;
    public final TextView longitudTextView;

    public PerroViewHolder(View itemView, ItemClickListener itemClickListener) {
        super(itemView);

        this.miItemClickListener = itemClickListener;
        textViewNombre = (TextView) itemView.findViewById(R.id.textViewNombre);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        latitudTextView = (TextView)itemView.findViewById(R.id.latitudTextView);
        longitudTextView =(TextView)itemView.findViewById(R.id.longitudTextView);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                miItemClickListener.onItemClick(v,getAdapterPosition());
            }

        });


    }
}
