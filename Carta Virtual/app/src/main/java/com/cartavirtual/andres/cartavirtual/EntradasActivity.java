package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EntradasActivity extends Activity
{
    ListView listViewEntradas;
    Adaptador adaptadorEntradas;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        listViewEntradas = (ListView) findViewById(R.id.MenuListViewEntradas);
        adaptadorEntradas = new Adaptador(this, Entradas());
        listViewEntradas.setAdapter(adaptadorEntradas);
    }

    private ArrayList<Entidad> Entradas()
    {
        ArrayList<Entidad> listItems = new ArrayList<Entidad>();
        listItems.add(new Entidad(R.drawable.bolitasdeyucayqueso,"Bolitas de yuca con queso"));
        listItems.add(new Entidad(R.drawable.aborrajadosdeplatanomaduro,"Aborrajados de platano maduro"));
        return  listItems;
    }
}
