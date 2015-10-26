package com.example.android.tarearecvpager;

import java.io.Serializable;

/**
 * Created by TOSHIBA on 24/10/2015.
 */
public class Perro implements Serializable {

    private final double latitud;
    private final double longitud;
    private String nombre;
    private String url;


    public Perro(String nombre, String url, double latitud, double longitud) {
        this.nombre = nombre;
        this.url = url;
        this.latitud = latitud;
        this.longitud = longitud;
    }


    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }
}
