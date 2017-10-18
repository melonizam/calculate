package com.tutorials.hp.navviewrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class TenActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;


    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Intent i = getIntent();

        title = i.getExtras().getString("name");
        getSupportActionBar().setTitle(title);

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TenActivity.this, WebViewActivity.class);
                myIntent.putExtra("title", button1.getText().toString());
                myIntent.putExtra("number", "10a");
                startActivityForResult(myIntent,0);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TenActivity.this, WebViewActivity.class);
                myIntent.putExtra("title", button2.getText().toString());
                myIntent.putExtra("number", "10b");
                startActivityForResult(myIntent,0);
            }
        });

        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TenActivity.this, WebViewActivity.class);
                myIntent.putExtra("title", button1.getText().toString());
                myIntent.putExtra("number", "10c");
                startActivityForResult(myIntent,0);
            }
        });

        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(TenActivity.this, WebViewActivity.class);
                myIntent.putExtra("title", button1.getText().toString());
                myIntent.putExtra("number", "10d");
                startActivityForResult(myIntent,0);
            }
        });




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }



}