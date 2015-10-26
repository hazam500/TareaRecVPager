package com.example.android.tarearecvpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class SupportMapFragment extends android.support.v4.app.Fragment implements OnMapReadyCallback {
    private double latitud;
    private double longitud;
    private MapView mapView;

    public SupportMapFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map,container,false);
        mapView = (MapView)view.findViewById(R.id.map);
        mapView.getMapAsync(this);
        mapView.onCreate(savedInstanceState);

        latitud = getArguments().getDouble("latitud");
        longitud = getArguments().getDouble("longitud");

        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        
        googleMap.getUiSettings().setAllGesturesEnabled(false);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitud, longitud), 16));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(latitud, longitud)));

    }
}
