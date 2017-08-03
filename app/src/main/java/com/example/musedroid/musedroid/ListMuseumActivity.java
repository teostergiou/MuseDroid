package com.example.musedroid.musedroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListMuseumActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_museum);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView)findViewById(R.id.listView);
        toolbar.setTitle(getResources().getString(R.string.ListMuseum));
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ListMuseumActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Museums));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent(view.getContext(),AcropolisActivity.class);
                    intent.putExtra("MuseumName", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(ListMuseumActivity.this,BenakiMuseumActivity.class);
                    intent.putExtra("MuseumName", listView.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
            }

        });

        listView.setAdapter(mAdapter);

    }
}
