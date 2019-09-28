package com.example.eva1_7_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSetText;
    TextView txtScroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSetText = findViewById(R.id.btnSetText);
        txtScroll = findViewById(R.id.txtScroll);

        btnSetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtScroll.append("Ahi muere con el calor alv \n");
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.wtf("Pantalla","Portrait");
        } else
            Log.wtf("Pantalla", "Landscape");
    }
}
