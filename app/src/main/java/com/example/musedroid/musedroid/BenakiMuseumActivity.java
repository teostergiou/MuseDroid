package com.example.musedroid.musedroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class BenakiMuseumActivity extends AppCompatActivity {
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benaki_museum);

        mToolbar = (Toolbar) findViewById(R.id.toolbar3);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            mToolbar.setTitle(bundle.getString("MuseumName"));
        }
    }
}
