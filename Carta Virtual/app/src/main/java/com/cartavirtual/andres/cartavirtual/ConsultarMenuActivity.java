package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;

public class ConsultarMenuActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_menu);

    }
    void VerEntradas(View v)
    {
        Intent verSedeIntencion = new Intent(ConsultarMenuActivity.this, EntradasActivity.class);
        startActivity(verSedeIntencion);
    }

    void VerPlatosFuertes(View v)
    {
        Intent verSedeIntencion = new Intent(ConsultarMenuActivity.this, PlatosFuertesActivity.class);
        startActivity(verSedeIntencion);
    }

    void VerPostres(View v)
    {
        Intent verSedeIntencion = new Intent(ConsultarMenuActivity.this, PostresActivity.class);
        startActivity(verSedeIntencion);
    }

    void VerBebidas(View v)
    {
        Intent verSedeIntencion = new Intent(ConsultarMenuActivity.this, BebidasActivity.class);
        startActivity(verSedeIntencion);
    }


}
