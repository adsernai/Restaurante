package com.cartavirtual.andres.cartavirtual;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adaptador extends BaseAdapter
{
    private Context contex;
    private ArrayList<Entidad> listItems;

    public  Adaptador(Context contex, ArrayList<Entidad> listItems)
    {
        this.contex = contex;
        this.listItems = listItems;
    }
    @Override
    public int getCount()
    {
        return listItems.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Entidad item = (Entidad) getItem(position);

        convertView = LayoutInflater.from(contex).inflate(R.layout.item,null);
        ImageView imgFoto = (ImageView)convertView.findViewById(R.id.imgFoto);
        TextView titulo = (TextView)convertView.findViewById((R.id.titulo));

        imgFoto.setImageResource(item.GetImageFoto());
        titulo.setText(item.GetTitulo());
        return convertView;
    }
}
