package com.example.android.tarearecvpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class PerroDetalleAdapter extends FragmentPagerAdapter{

    private final PerroDetalle perrodetalle;

    public PerroDetalleAdapter(AppCompatActivity activity, PerroDetalle perroDetalle) {
        super(activity.getSupportFragmentManager());
        this.perrodetalle = perroDetalle;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            Fragment mapFragment = new SupportMapFragment();
            Bundle bundle = new Bundle();
            bundle.putDouble("latitud", perrodetalle.getLatitud());
            bundle.putDouble("longitud", perrodetalle.getLongitud());
            mapFragment.setArguments(bundle);
            return mapFragment;

        } else {
            Fragment imagenFragment = new ImagenFragment();
            Bundle bundle = new Bundle();
            bundle.putString("url", perrodetalle.getUrlFotoPerro().get(position - 1));
            imagenFragment.setArguments(bundle);
            return imagenFragment;
        }
    }

    @Override
    public int getCount() {
        return perrodetalle.getUrlFotoPerro().size() + 1;
    }
}
