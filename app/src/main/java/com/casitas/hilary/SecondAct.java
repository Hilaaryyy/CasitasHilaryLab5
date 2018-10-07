package com.casitas.hilary;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class SecondAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name2);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void onClick (View v){

        Intent i = null, chooser = null;
        if(v.getId() == R.id.button1){
            i = new Intent( SecondAct.this, MainActivity.class);
            SecondAct.this.startActivity(i);
        }

        else if(v.getId() == R.id.button2){
            Uri g = Uri.parse("geo:10.299087, 123.903705");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Choose map application");
            startActivity(chooser);
        }

    }

}