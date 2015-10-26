package com.example.android.tarearecvpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SegundaActividad extends AppCompatActivity {

    private ViewPager viewPager;
    private TextView nombrePerro;
    private TextView longitudPerro;
    private TextView latitudPerro;
    private PerroDetalle perroDetalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        nombrePerro = (TextView) findViewById(R.id.nombreTextView);
        longitudPerro = (TextView) findViewById(R.id.longitudTextView);
        latitudPerro = (TextView)findViewById(R.id.latitudTextView);

        Perro perro = (Perro) getIntent().getSerializableExtra("perro");

        List<String> urlFotoPerro = new ArrayList<>();

        urlFotoPerro.add(new String("https://upload.wikimedia.org/wikipedia/commons/0/0e/Chow-chow_in_Tallinn.JPG"));
        urlFotoPerro.add(new String("http://www.royalclubchowchows.com/bm.pix/chow_dogs_mrjunior.s400x400.jpg"));

        String nombre = perro.getNombre();
        double latitud = perro.getLatitud();
        double longitud = perro.getLongitud();

        perroDetalle= new PerroDetalle(nombre, latitud, longitud, urlFotoPerro);

        PerroDetalleAdapter perroDetalleAdapter = new PerroDetalleAdapter(this, perroDetalle);
        viewPager.setAdapter(perroDetalleAdapter);

        nombrePerro.setText(nombre);
        latitudPerro.setText(String.valueOf(latitud));
        longitudPerro.setText(String.valueOf(longitud));
    }
}
