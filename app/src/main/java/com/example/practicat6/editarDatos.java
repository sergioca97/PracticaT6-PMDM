package com.example.practicat6;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class editarDatos extends AppCompatActivity
{
    ImageView imgPersona1, imgPersona2, imgPersona3, imgPersona4, imgPersona5, imgPersona6;
    EditText edtTelefono, edtCorreo;
    String numero = "", correo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_datos);
        imgPersona1 = findViewById(R.id.imgPersona1);
        imgPersona2 = findViewById(R.id.imgPersona2);
        imgPersona3 = findViewById(R.id.imgPersona3);
        imgPersona4 = findViewById(R.id.imgPersona4);
        imgPersona5 = findViewById(R.id.imgPersona5);
        imgPersona6 = findViewById(R.id.imgPersona6);
        edtTelefono = findViewById(R.id.edtTelefono);
        edtCorreo = findViewById(R.id.edtCorreo);
    }
    public void btnActualizar(View view)
    {
        SharedPreferences prefs = getSharedPreferences("ficheroPreferencias", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(numero, edtTelefono.getText().toString());
        editor.putString(correo, edtCorreo.getText().toString());
        editor.commit();
        Toast.makeText(this,R.string.toastCampos , Toast.LENGTH_SHORT).show();
    }
    public void persona1(View view)
    {
        Toast.makeText(this,R.string.toastPersona1 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.VISIBLE);
        imgPersona2.setVisibility(View.INVISIBLE);
        imgPersona3.setVisibility(View.INVISIBLE);
        imgPersona4.setVisibility(View.INVISIBLE);
        imgPersona5.setVisibility(View.INVISIBLE);
        imgPersona6.setVisibility(View.INVISIBLE);
    }
    public void persona2(View view)
    {
        Toast.makeText(this,R.string.toastPersona2 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.INVISIBLE);
        imgPersona2.setVisibility(View.VISIBLE);
        imgPersona3.setVisibility(View.INVISIBLE);
        imgPersona4.setVisibility(View.INVISIBLE);
        imgPersona5.setVisibility(View.INVISIBLE);
        imgPersona6.setVisibility(View.INVISIBLE);


    }
    public void persona3(View view)
    {
        Toast.makeText(this,R.string.toastPersona3 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.INVISIBLE);
        imgPersona2.setVisibility(View.INVISIBLE);
        imgPersona3.setVisibility(View.VISIBLE);
        imgPersona4.setVisibility(View.INVISIBLE);
        imgPersona5.setVisibility(View.INVISIBLE);
        imgPersona6.setVisibility(View.INVISIBLE);

    }
    public void persona4(View view)
    {
        Toast.makeText(this,R.string.toastPersona4 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.INVISIBLE);
        imgPersona2.setVisibility(View.INVISIBLE);
        imgPersona3.setVisibility(View.INVISIBLE);
        imgPersona4.setVisibility(View.VISIBLE);
        imgPersona5.setVisibility(View.INVISIBLE);
        imgPersona6.setVisibility(View.INVISIBLE);
    }
    public void persona5(View view)
    {
        Toast.makeText(this,R.string.toastPersona5 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.INVISIBLE);
        imgPersona2.setVisibility(View.INVISIBLE);
        imgPersona3.setVisibility(View.INVISIBLE);
        imgPersona4.setVisibility(View.INVISIBLE);
        imgPersona5.setVisibility(View.VISIBLE);
        imgPersona6.setVisibility(View.INVISIBLE);

    }
    public void persona6(View view)
    {
        Toast.makeText(this,R.string.toastPersona6 , Toast.LENGTH_SHORT).show();
        imgPersona1.setVisibility(View.INVISIBLE);
        imgPersona2.setVisibility(View.INVISIBLE);
        imgPersona3.setVisibility(View.INVISIBLE);
        imgPersona4.setVisibility(View.INVISIBLE);
        imgPersona5.setVisibility(View.INVISIBLE);
        imgPersona6.setVisibility(View.VISIBLE);


    }
}