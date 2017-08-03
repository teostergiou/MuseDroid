package com.example.musedroid.musedroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Museum Button
    Button button1;
    //Nearby Button
    Button button2;
    //Visited Favorites Button
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToListMuseumActivity();
            }
        });


    }

    private void goToListMuseumActivity(){

        startActivity(new Intent(this,ListMuseumActivity.class));
    }
}
