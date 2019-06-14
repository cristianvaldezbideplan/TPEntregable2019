package com.example.tpentregable2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_NuevoUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__nuevo_usuario);
    }
    public void EstaRegistrado (View view) {
        Intent I4 = new Intent(activity_NuevoUsuario.this, CondicionServicioGoogle.class);
        startActivity(I4);
    }
}
