package com.example.android.tarearecvpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.sitios);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<Perro> listPerro = new ArrayList<>();

        listPerro.add(new Perro("Pastor aleman", "http://www.mascotasgranada.com/images/aika-de-vall-alfandech.jpg",-4.51,74.5));
        listPerro.add(new Perro("Golden retriever", "http://buzzsharer.com/wp-content/uploads/2015/06/resting-golden-retriever.jpg",-4.52,74.4));
        listPerro.add(new Perro("Boxer", "http://static.wamiz.fr/images/animaux/chiens/large/boxer-876.jpg",-4.53,74.3));
        listPerro.add(new Perro("Chow chow", "https://upload.wikimedia.org/wikipedia/commons/4/4c/ChowChow2Szczecin.jpg", -4.54, 74.2));


        PerrosAdapter perrosAdapter = new PerrosAdapter(this, listPerro, new ItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                gotToDetail(listPerro.get(position));
            }
        });

        recyclerView.setAdapter(perrosAdapter);


    }

    private void gotToDetail(Perro perro){
        Intent intent = new Intent(this,SegundaActividad.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("perro",perro);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
