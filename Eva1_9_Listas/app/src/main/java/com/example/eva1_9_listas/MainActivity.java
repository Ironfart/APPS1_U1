package com.example.eva1_9_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstDatos;
    TextView txtRst;

    String[] asRest = {
            "Montados la junta",
            "Montados de villa",
            "Taco 'n madres",
            "El Tacón Milenario",
            "Deli Burgers",
            "Tortas Don Fermín",
            "Burros El Escuadrón",
            "Doña Pelos",
            "Steak House",
            "Las Espadas",
            "C19",
            "Chiwas",
            "Gelos",
            "El Borrego",
            "Tortas El Buen Gusto",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstDatos = findViewById(R.id.lstListDatos);
        txtRst = findViewById(R.id.txtRest);

        lstDatos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,asRest));

        lstDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        txtRst.setText(asRest[pos]);
    }
}
