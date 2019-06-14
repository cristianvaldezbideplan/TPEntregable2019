package com.example.tpentregable2019;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class informacionDesarrollador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_desarrollador);
    }
    public void AtrasDecision1 (View view) {
            Intent I8 = new Intent(informacionDesarrollador.this, ProgramadorOSitioWed.class);
            startActivity(I8);
    }
    public void Telefono (View view) {
        Intent Tel = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:15551234"));
        startActivity(Tel);
    }
    public void GitHub (View view) {
        Intent GH = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/cristianvaldezbideplan"));
        startActivity(GH);
    }
   // public void E-Mail (View view) {
   //   Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
   //     emailIntent.setType(HTTP.PLAIN_TEXT_TYPE);
   //     emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"jon@example.com"}); // recipients
   //     emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
   //     emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
   //     emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
// You can also attach multiple items by passing an ArrayList of Uris
   //     startActivity(emailIntent);
    //}
}
