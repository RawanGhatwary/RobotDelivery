package com.example.robotdelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Deliver extends AppCompatActivity {
    private ListView listView;
    String items[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deliver);
        listView=(ListView)findViewById(R.id.listview);
        items=new String[]{"farah","rawan","bahrawy","oufa"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(Deliver.this,android.R.layout.simple_list_item_1,items);
        listView.setAdapter(arrayAdapter);
    }
}
