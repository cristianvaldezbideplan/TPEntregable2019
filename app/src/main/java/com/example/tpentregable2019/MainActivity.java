package com.example.tpentregable2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
    /** Called when the user taps the Send button */
    public void sendMessage (View view) {
        Intent I = new Intent(MainActivity.this, Usuario_Decision.class);
        startActivity(I);
    }
}

