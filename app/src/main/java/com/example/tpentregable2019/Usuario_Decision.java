package com.example.tpentregable2019;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Usuario_Decision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario__decision);
    }
    /** Called when the user taps the Send button */
    public void sendMessage (View view) {
        Intent I2 = new Intent(Usuario_Decision.this, Login_Usuraio.class);
        startActivity(I2);
    }
    public void Registrarse (View view) {
        Intent I3 = new Intent(Usuario_Decision.this, activity_NuevoUsuario.class);
        startActivity(I3);
    }
}
