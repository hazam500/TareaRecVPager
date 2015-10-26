package com.example.android.tarearecvpager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class PerroDetalle {

    private String nombre;
    private double latitud;
    private double longitud;
    private List<String> urlFotoPerro;



    public PerroDetalle(String nombre, double latitud, double longitud, List<String> urlFotoPerro) {


        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.urlFotoPerro = new ArrayList<>();
        this.urlFotoPerro = urlFotoPerro;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getUrlFotoPerro() {
        return urlFotoPerro;
    }
}
