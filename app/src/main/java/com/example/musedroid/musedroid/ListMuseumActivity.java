package com.example.musedroid.musedroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListMuseumActivity extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_museum);

        ArrayList<String> museumList = new ArrayList<>();
        museumList.add("Μουσείο Ακρόπολης");
        museumList.add("Πολεμικό Μουσείο");
        museumList.add("Μουσείο Μπενάκη");
        museumList.add("Βυζαντινό και Χριστιανικό Μουσείο");
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = (ListView)findViewById(R.id.listView);
        toolbar.setTitle(getResources().getString(R.string.ListMuseum));
        // Create The Adapter with passing ArrayList as 3rd paramete
        /*getResources().getStringArray(R.array.Museums)*/
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(ListMuseumActivity.this,
                android.R.layout.simple_list_item_1,museumList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                /// Get the Item from ListView
                View view = super.getView(position, convertView, parent);
                if(position %2 == 1)
                {
                    // Set a background color for ListView regular row/item
                    view.setBackgroundColor(Color.parseColor("#1c1b1b"));
                }
                else
                {
                    // Set the background color for alternate row/item
                    view.setBackgroundColor(Color.parseColor("#665f5f"));
                }
                TextView tv = view.findViewById(android.R.id.text1);

                // Set the text size 25 dip for ListView each item
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP,20);
                tv.setTextColor(Color.parseColor("#a51f1f"));
                tv.setGravity(Gravity.CENTER);
                tv.setTextAlignment(View.TEXT_ALIGNMENT_GRAVITY);

                // Return the view
                return view;
            }
        };
        // register onClickListener to handle click events on each item
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            // argument position gives the index of item which is clicked
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


        // Set The Adapter
        listView.setAdapter(mAdapter);

    }
}