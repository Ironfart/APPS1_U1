package com.example.eva1_10_listaclima;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter<Clima> {

    Context context;
    int resource;
    Clima[] cCities;

    public ClimaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.cCities = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgClima;
        TextView txtCiudad, txtTemp, txtClima;

        //convert view es el layout que representa una fila en la lista
        if (convertView == null){
            //crear nuestro layout
            //inflater
            LayoutInflater lInflater = ((Activity)context).getLayoutInflater();
            convertView = lInflater.inflate(resource, parent, false);
        }
        imgClima = convertView.findViewById(R.id.imgClima);
        txtCiudad = convertView.findViewById(R.id.txtCity);
        txtTemp = convertView.findViewById(R.id.txtDeg);
        txtClima = convertView.findViewById(R.id.txtWea);

        imgClima.setImageResource(cCities[position].getImagen());
        txtCiudad.setText(cCities[position].getCiudad());
        txtTemp.setText(cCities[position].getTemp() + " °C");
        txtClima.setText(cCities[position].getClima());

        return super.getView(position, convertView, parent);
    }
}
