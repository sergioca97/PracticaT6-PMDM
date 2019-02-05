package com.example.practicat6;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class personas extends AppCompatActivity
{
    private static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =  1;
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
            telefono="teléfono";
            correo="correo electrónico";
            registerForContextMenu(imgPersona1);
            return false;
        }
        });

        imgPersona2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="693418271";
                correo="correodeprueba@gmail.com";
                registerForContextMenu(imgPersona2);
                return false;
            }
        });

        imgPersona3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="641852197";
                correo="correodeprueba2@gmail.com";
                registerForContextMenu(imgPersona3);
                return false;
            }
        });

        imgPersona4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="610057120";
                correo="correodeprueba3@gmail.com";
                registerForContextMenu(imgPersona4);
                return false;
            }
        });

        imgPersona5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                telefono="693418271";
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
                correo="correodeprueba6@gmail.com";
                registerForContextMenu(imgPersona6);
                return false;
            }
        });
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.editarpersonas, menu);
    }

    public boolean onContextItemSelected(MenuItem item)
    {
        prefs = getSharedPreferences("almacenarPersonas", Context.MODE_PRIVATE);

        switch(item.getItemId())
        {
            case R.id.editar:
                Intent intent2 = new Intent(this, editarDatos.class);
                startActivity(intent2);
                return false;
        }
        return super.onContextItemSelected(item);
    }
}

