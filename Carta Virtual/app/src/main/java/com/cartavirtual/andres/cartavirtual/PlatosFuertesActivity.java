package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;
public class PlatosFuertesActivity extends Activity
{
    ListView listViewPlatosFuertes;
    Adaptador adaptadorPlatosFuertes;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos_fuertes);

        listViewPlatosFuertes = (ListView) findViewById(R.id.MenuListViewPlatosFuertes);
        adaptadorPlatosFuertes = new Adaptador(this, PlatosFuertes());
        listViewPlatosFuertes.setAdapter(adaptadorPlatosFuertes);
    }

    private ArrayList<Entidad> PlatosFuertes()
    {
        ArrayList<Entidad> listItems = new ArrayList<Entidad>();
        listItems.add(new Entidad(R.drawable.carnedesmechadaoropavieja,"Carne desmechada o ropa vieja"));
        listItems.add(new Entidad(R.drawable.carneconchampinones,"Carne con champiñones"));
        return  listItems;
    }
}
