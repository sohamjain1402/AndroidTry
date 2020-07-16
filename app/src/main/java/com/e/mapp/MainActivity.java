package com.e.mapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView textView1;
    ListView listView;
    ArrayAdapter<String> adapter;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_listview);
        //textView1 =(TextView)findViewById(R.id.textView2);
        listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("Sidhart Kumar Tiwari");
        adapter.add("Vedant Jaiswal");
        adapter.add("Shikhar Panwar");
        adapter.add("Shubhansu");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    static String Item;
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Item = adapter.getItem(i);
        Toast.makeText(this, "You have selected " +Item, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);

    }
    /*public void Clickhandler(View view){
        Toast.makeText(this,"",Toast.LENGTH_LONG).show();
    }*/
}