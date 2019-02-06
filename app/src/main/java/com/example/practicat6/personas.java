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
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.editarpersonas, menu);
    }

    public boolean onContextItemSelected(MenuItem item)
    {
        String numero="";
        String correos="";
        prefs = getSharedPreferences("almacenarPersonas", Context.MODE_PRIVATE);

        switch(item.getItemId())
        {
            case R.id.llamar:
                numero = prefs.getString(telefono, null);
                if(numero==null)
                {
                    Toast.makeText(this, R.string.toastTelefono, Toast.LENGTH_LONG).show();
                }
                else
                {
                    if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
                    {
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse(telefono));
                        startActivity(callIntent);
                    }
                    else
                    {
                        requestPermissions(new String[]{CALL_PHONE}, 1);
                    }
                }
                break;
            case R.id.correo:
                correos = prefs.getString(correo, null);
                if(correos==null)
                {
                    Toast.makeText(this, R.string.toastCorreo, Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setType("text/plain");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{correos});
                    startActivity(emailIntent);
                }
                break;
            case R.id.editar:
                Intent intent2 = new Intent(this, editarDatos.class);
                startActivity(intent2);
                return false;
        }
        return super.onContextItemSelected(item);
    }
}

