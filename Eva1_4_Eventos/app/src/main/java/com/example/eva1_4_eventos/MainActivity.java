package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnPorInt;
    Button btnClaseAn;
    Button btnClaseExt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPorInt = findViewById(R.id.btnPorInt);
        btnClaseAn = findViewById(R.id.btnPorClaseAn);
        btnClaseExt = findViewById(R.id.btnClaseExt);

        btnPorInt.setOnClickListener(this); //main activity se convierte en un escuchador de clicks, por eso se rerefencia

        btnClaseAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MainActivity.this puede reemplazarse por getApplicationContext()
                //todo lo grafico requiere contexto

                Toast.makeText(MainActivity.this,"Por clase anonima",Toast.LENGTH_LONG).show();
            }
        });

        MiEventoClick meClick = new MiEventoClick();
        meClick.setContext(this);
        btnClaseExt.setOnClickListener(meClick);
    }

    public void miClick(View v){
        Toast.makeText(this,"Holi raza",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Evento por listener",Toast.LENGTH_LONG).show();
    }
}
