package com.example.eva1_10_listaclima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] cCities = {
            new Clima(),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.cloudy,"Camargopolis",28,"Chevere"),
            new Clima(R.drawable.light_rain,"Parral",20,"Mamalon"),
            new Clima(R.drawable.atmospher,"Creel",25,"Cotorro"),
            new Clima(R.drawable.atmospher,"Jimenez",34,"Caguamero"),
            new Clima(R.drawable.atmospher,"Delicias",30,"Carnitas"),
            new Clima(R.drawable.atmospher,"Juarez",40,"Del nabo"),
    };

    ListView lstClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstClima = findViewById(R.id.lstClima);
    }
}
