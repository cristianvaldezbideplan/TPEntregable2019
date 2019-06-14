package com.example.tpentregable2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProgramadorOSitioWed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programador_ositio_wed);
    }
    public void Programador (View view) {
        Intent I5 = new Intent(ProgramadorOSitioWed.this, informacionDesarrollador.class);
        startActivity(I5);
    }
    public void SitioWeb (View view) {
            Intent I5 = new Intent(ProgramadorOSitioWed.this, SitioWed.class);
            startActivity(I5);
    }
}