package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lv = (ListView) this.findViewById(R.id.lvModule);
        al = new ArrayList<String>();
        lv.setAdapter(aa);
        al.add("Year 1");
        al.add("Year 2");
        al.add("Year 3");
        aa.notifyDataSetChanged();


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(FirstActivity.this,
                        SecondActivity.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("year", al.get(position));

                // Start the new activity
                startActivity(i);
            }
        });
    }
}




