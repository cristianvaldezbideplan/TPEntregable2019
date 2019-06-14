package com.example.tpentregable2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login_Usuraio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__usuraio);
    }
    public void Login (View view) {
        String usuario =((EditText)findViewById(R.id.editText_Nombre)).getText().toString();
        String Contraseña =((EditText)findViewById(R.id.editText3_password)).getText().toString();
        if ((usuario.equals("Cristian") || usuario.equals("admin")) && (Contraseña.equals("1234") || Contraseña.equals("admin")))
          {
            Intent I7 = new Intent(Login_Usuraio.this, ProgramadorOSitioWed.class);
            startActivity(I7);
          }
        else
          {
              Toast.makeText(getApplicationContext(), "Usuario Incorrecto",Toast.LENGTH_SHORT).show();
          }

    }
}
