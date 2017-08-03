package com.example.musedroid.musedroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class AcropolisActivity extends AppCompatActivity {

    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acropolis);
        mToolbar = (Toolbar) findViewById(R.id.toolbar2);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            mToolbar.setTitle(bundle.getString("MuseumName"));
        }
    }
}
