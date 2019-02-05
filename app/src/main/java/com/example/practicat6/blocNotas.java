package com.example.practicat6;


import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class blocNotas extends AppCompatActivity
{
    EditText edtArea;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloc_notas);
        prefs = getSharedPreferences("ficheroPreferencias", Context.MODE_PRIVATE);
        edtArea = findViewById(R.id.edtArea);
        edtArea.setText(prefs.getString("BlocNotas", ""));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.guardarbloc, menu);
        MenuBuilder m = (MenuBuilder) menu;
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("BlocNotas", edtArea.getText().toString());
        editor.commit();
        Toast.makeText(this,"Texto Guardado con Éxito" , Toast.LENGTH_SHORT).show();
        return false;
    }
}