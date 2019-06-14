package com.example.tpentregable2019;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SitioWed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitio_wed);
    }
    public void AtrasDecision2 (View view) {
        Intent I9 = new Intent(SitioWed.this, ProgramadorOSitioWed.class);
        startActivity(I9);
    }
    public void SitioWed (View view) {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.razer.com/"));
        startActivity(webIntent);
    }
}
