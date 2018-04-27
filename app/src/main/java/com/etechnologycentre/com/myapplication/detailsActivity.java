package com.etechnologycentre.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class detailsActivity extends AppCompatActivity {
    ListView lv;
    TextView tv;
    ArrayList<String> alitems;
    ArrayAdapter aa;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailslayout);

        tv = (TextView)findViewById(R.id.idTitle);
        lv = (ListView)findViewById(R.id.listview);

        alitems = new ArrayList<String>();
        alitems.add("HELLO");
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alitems);


        lv.setAdapter(aa);





        tv.setText("PIZZA HUT");







    }
}
