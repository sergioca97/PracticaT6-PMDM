package com.example.practicat6;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class editarDatos extends AppCompatActivity
{
    EditText edtTelefono, edtCorreo;
    String numero = "", correo = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_datos);

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
        Toast.makeText(this,"Campos actualizados correctamente." , Toast.LENGTH_SHORT).show();
    }
    public void persona1(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 1" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 1";
        correo="correo persona 1";
    }
    public void persona2(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 2" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 2";
        correo="correo persona 2";

    }
    public void persona3(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 3" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 3";
        correo="correo persona 3";
    }
    public void persona4(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 4" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 4";
        correo="correo persona 4";
    }
    public void persona5(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 5" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 5";
        correo="correo persona 5";
    }
    public void persona6(View view)
    {
        Toast.makeText(this,"Has seleccionado la persona 6" , Toast.LENGTH_SHORT).show();
        numero="teléfono persona 6";
        correo="correo persona 6";

    }
}