package com.example.tpentregable2019;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CondicionServicioGoogle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condicion_servicio_google);
    }
    public void AceptarCondicion (View view) {
        Intent I5 = new Intent(CondicionServicioGoogle.this, Login_Usuraio.class);
        startActivity(I5);
    }
}
