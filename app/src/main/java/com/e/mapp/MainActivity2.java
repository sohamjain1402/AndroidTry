package com.e.mapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    String name = "Shubhansu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView)findViewById(R.id.textView2);
        if(MainActivity.Item.equals(name)){
            textView.setText("120");
        }
        else
            textView.setText(MainActivity.Item);
    }

    public void backFunction(View view){
        Toast.makeText(this,"Here we go", Toast.LENGTH_LONG).show();
        //textView.setText(MainActivity.Item);
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

}