package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void VerSede(View v)
    {
        Intent verSedeIntencion = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(verSedeIntencion);
    }

    void ReservarMesa(View v)
    {
        String telefono = "3212582202";
        String mensaje = "Hola, quisiera reservar una mesa para comer";
        Uri uri = Uri.parse("smsto:" + telefono);
        Intent intencionReservarMesa = new Intent(Intent.ACTION_SENDTO,uri);
        intencionReservarMesa.setPackage("com.whatsapp");
        startActivity(intencionReservarMesa);
    }

    void ConsultarMenu(View v)
    {
        Intent intencionConsultarMenu = new Intent(this, ConsultarMenuActivity.class);
        startActivity(intencionConsultarMenu);
    }
    void CalificarServicio(View v)
    {
        Intent intencionCalificarServicio = new Intent(this, CalificarServicioActivity.class);
        startActivity(intencionCalificarServicio);
    }
}
