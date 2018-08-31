package com.cartavirtual.andres.cartavirtual;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class CalificarServicioActivity extends Activity
{
    LinearLayout layout;
    CheckBox [] stars;
    CheckBox star1;
    CheckBox star2;
    CheckBox star3;
    CheckBox star4;
    CheckBox star5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificar_servicio);

        layout = (LinearLayout)findViewById(R.id.linearLayout);
        stars = new CheckBox[5];
        star1 = (CheckBox) layout.findViewById(R.id.Star1);
        stars[0] = star1;
        star1.setOnClickListener(startsListener);
        star2 = (CheckBox) layout.findViewById(R.id.Star2);
        stars[1] = star2;
        star2.setOnClickListener(startsListener);
        star3 = (CheckBox) layout.findViewById(R.id.Star3);
        stars[2] = star3;
        star3.setOnClickListener(startsListener);
        star4 = (CheckBox) layout.findViewById(R.id.Star4);
        stars[3] = star4;
        star4.setOnClickListener(startsListener);
        star5 = (CheckBox) layout.findViewById(R.id.Star5);
        stars[4] = star5;
        star5.setOnClickListener(startsListener);
    }

    private View.OnClickListener startsListener = new View.OnClickListener()
    {
        public  void onClick(View v)
        {
            int tag = Integer.valueOf((String)v.getTag());

            for(int i = 0; i <= tag; i ++)
            {
                stars[i].setChecked(true);
            }

            for(int i = tag + 1 ; i < 5; i ++)
            {
                stars[i].setChecked(false);
            }
        }
    };
}
