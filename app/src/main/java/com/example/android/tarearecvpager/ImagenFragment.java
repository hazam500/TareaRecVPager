package com.example.android.tarearecvpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class ImagenFragment extends android.support.v4.app.Fragment {

    private ImageView lugarImagen;

    public ImagenFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_imagen, container, false);
        lugarImagen = (ImageView) view.findViewById(R.id.lugar_imagen);

        String url = getArguments().getString("url");

        Picasso.with(getActivity()).load(url).into(lugarImagen);

        return view;
    }

}