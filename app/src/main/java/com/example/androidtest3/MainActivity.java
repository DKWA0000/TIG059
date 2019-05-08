package com.example.androidtest3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button jaknapp = findViewById(R.id.ja_knapp);
        jaknapp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View z){
                Intent standard = new Intent(MainActivity.this, SystemetActivity.class);
                startActivity(standard);
            }
        });

        final Button nejknapp = findViewById(R.id.nej_knapp);
        nejknapp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View x){
                System.exit(0);
            }
        });

    }

}
