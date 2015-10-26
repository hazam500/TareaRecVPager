package com.example.android.tarearecvpager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class PerrosAdapter extends RecyclerView.Adapter<PerroViewHolder>{

    private final Context context;
    private final ArrayList<Perro> perros;
    private final ItemClickListener miItemClickListener;

    @Override
    public PerroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list,parent,false);
        PerroViewHolder viewHolder = new PerroViewHolder(view,miItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PerroViewHolder holder, int position) {

        Perro perro = this.perros.get(position);
        holder.textViewNombre.setText(perro.getNombre());
        holder.latitudTextView.setText(String.valueOf(perro.getLatitud()));
        holder.longitudTextView.setText(String.valueOf(perro.getLongitud()));
        Picasso.with(context).load(perro.getUrl()).into(holder.imageView);


    }



    @Override
    public int getItemCount() {
        return perros.size();
    }




    public PerrosAdapter(Context context,List<Perro> perros, ItemClickListener itemClickListener){

        this.context = context;
        this.perros = new ArrayList<>();
        this.perros.addAll(perros);
        this.miItemClickListener = itemClickListener;
;    }


}
