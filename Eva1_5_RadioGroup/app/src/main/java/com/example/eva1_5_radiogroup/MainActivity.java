package com.example.eva1_5_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rgComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgComida = findViewById(R.id.rgComida);

        rgComida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String msg = "";
        if (i == R.id.radioButton) {
            msg = "Tacos";
        } else if (i == R.id.radioButton2) {
            msg = "Tortas";
        } else if (i == R.id.radioButton3) {
            msg = "Montados";
        } else {
            msg = "Burgers";
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
