package com.example.practicat6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    AppCompatActivity Principal;
    ImageView imgPersonas, imgNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Principal = this;
        imgPersonas = findViewById(R.id.imgPersonas);
        imgNotas = findViewById(R.id.imgNotas);
        imgPersonas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, personas.class);
                startActivity(intent);
            }
        });
        imgNotas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Principal, blocNotas.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuBuilder m = (MenuBuilder) menu;
        //m.setOptionalIconsVisible(true);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.menuPersonas:
                Intent intento = new Intent(Principal, personas.class);
                startActivity(intento);
                break;
            case R.id.menuBlocNotas:
                Intent intento1 = new Intent(Principal, blocNotas.class);
                startActivity(intento1);
                break;
        }
        return false;
    }
}