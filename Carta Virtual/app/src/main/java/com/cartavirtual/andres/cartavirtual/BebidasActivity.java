package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;

public class BebidasActivity extends Activity {
    ListView listViewBebidas;
    Adaptador adaptadorBebidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);
        listViewBebidas= (ListView) findViewById(R.id.MenuListViewBebidas);
        adaptadorBebidas = new Adaptador(this, Bebidas());
        listViewBebidas.setAdapter(adaptadorBebidas);
    }
    private ArrayList<Entidad> Bebidas()
    {
        ArrayList<Entidad> listItems = new ArrayList<Entidad>();
        listItems.add(new Entidad(R.drawable.refajo,"Refajo"));
        return  listItems;
    }
}
