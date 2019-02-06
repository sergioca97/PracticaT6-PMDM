package com.example.practicat6;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class personas extends AppCompatActivity
{
    ImageView imgPersona1, imgPersona2, imgPersona3, imgPersona4, imgPersona5, imgPersona6;
    SharedPreferences prefs;
    String telefono, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personas);
        imgPersona1 = findViewById(R.id.imgPersona1);
        imgPersona2 = findViewById(R.id.imgPersona2);
        imgPersona3 = findViewById(R.id.imgPersona3);
        imgPersona4 = findViewById(R.id.imgPersona4);
        imgPersona5 = findViewById(R.id.imgPersona5);
        imgPersona6 = findViewById(R.id.imgPersona6);

        imgPersona1.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event)
        {
            telefono="";
            correo="";
            registerForContextMenu(imgPersona1);
            return false;
        }
        });

        imgPersona2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="";
                correo="";
                registerForContextMenu(imgPersona2);
                return false;
            }
        });

        imgPersona3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="";
                correo="";
                registerForContextMenu(imgPersona3);
                return false;
            }
        });

        imgPersona4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="";
                correo="";
                registerForContextMenu(imgPersona4);
                return false;
            }
        });

        imgPersona5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="";
                correo="";
                registerForContextMenu(imgPersona5);
                return false;
            }
        });

        imgPersona6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="";
                correo="";
                registerForContextMenu(imgPersona6);
                return false;
            }
        });
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu editar)
    {
        getMenuInflater().inflate(R.menu.editar, editar);
        MenuBuilder m = (MenuBuilder) editar;
        m.setOptionalIconsVisible(true);
        return true;
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.personas, menu);
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        Intent intento2 = new Intent(this, editarDatos.class);
        startActivity(intento2);
        return true;
    }
}

