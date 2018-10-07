package com.casitas.hilary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name1);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }

    public void onClick (View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button5){
            i = new Intent( MainActivity.this, SecondAct.class);
            MainActivity.this.startActivity(i);
        }
        else if(v.getId() == R.id.button6){
            Uri g = Uri.parse("geo:10.267497,, 123.943472");
            i = new Intent(Intent.ACTION_VIEW, g);
            chooser = Intent.createChooser(i, "Choose map application");
            startActivity(chooser);
        }

    }

}
