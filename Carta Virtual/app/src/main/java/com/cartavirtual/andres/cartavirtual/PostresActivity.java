package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;
public class PostresActivity extends Activity
{
    ListView listViewPostres;
    Adaptador adaptadorPostres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);

        listViewPostres = (ListView) findViewById(R.id.MenuListViewPostres);
        adaptadorPostres = new Adaptador(this, Postres());
        listViewPostres.setAdapter(adaptadorPostres);
    }
    private ArrayList<Entidad> Postres()
    {
        ArrayList<Entidad> listItems = new ArrayList<Entidad>();
        listItems.add(new Entidad(R.drawable.alfajores,"Alfajores"));
        return  listItems;
    }
}
