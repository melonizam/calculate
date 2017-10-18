package com.tutorials.hp.navviewrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by BazaarBari on 10/10/2017.
 */

public class WebViewActivity extends AppCompatActivity {
    String number;
    WebView dataload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        Intent i = getIntent();

        String title = i.getExtras().getString("title");
         number = i.getExtras().getString("number");


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(title);

        dataload = (WebView) findViewById(R.id.webview);
        dataload.getSettings().setJavaScriptEnabled(true);
        dataload.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        loadWebData();



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void loadWebData(){
        switch (number) {
            case "01":
                dataload.loadUrl("file:///android_asset/english11/01.html");
                return;
            case "02":
                this.dataload.loadUrl("file:///android_asset/english11/02.html");
                return;
            case "03":
                this.dataload.loadUrl("file:///android_asset/english11/03.html");
                return;
            case "04":
                this.dataload.loadUrl("file:///android_asset/english11/04.html");
                return;
            case "05a":
                this.dataload.loadUrl("file:///android_asset/english11/05a.html");
                return;
            case "05b":
                this.dataload.loadUrl("file:///android_asset/english11/05b.html");
                return;
            case "06a":
                this.dataload.loadUrl("file:///android_asset/english11/06a.html");
                return;
            case "06b":
                this.dataload.loadUrl("file:///android_asset/english11/06b.html");
                return;
            case "06c":
                this.dataload.loadUrl("file:///android_asset/english11/06c.html");
                return;
            case "06d":
                this.dataload.loadUrl("file:///android_asset/english11/06d.html");
                return;
            case "06e":
                this.dataload.loadUrl("file:///android_asset/english11/06e.html");
                return;
            case "06f":
                this.dataload.loadUrl("file:///android_asset/english11/06f.html");
                return;
            case "07a":
                this.dataload.loadUrl("file:///android_asset/english11/07a.html");
                return;
            case "07b":
                this.dataload.loadUrl("file:///android_asset/english11/07b.html");
                return;
            case "07c":
                this.dataload.loadUrl("file:///android_asset/english11/07c.html");
                return;
            case "08a":
                this.dataload.loadUrl("file:///android_asset/english11/08a.html");
                return;
            case "08b":
                this.dataload.loadUrl("file:///android_asset/english11/08b.html");
                return;
            case "08c":
                this.dataload.loadUrl("file:///android_asset/english11/08c.html");
                return;
            case "08d":
                this.dataload.loadUrl("file:///android_asset/english11/08d.html");
                return;
            case "09a":
                dataload.loadUrl("file:///android_asset/english11/09a.html");
                return;
            case "09b":
                this.dataload.loadUrl("file:///android_asset/english11/09b.html");
                return;
            case "09c":
                this.dataload.loadUrl("file:///android_asset/english11/09c.html");
                return;
            case "10a":
                this.dataload.loadUrl("file:///android_asset/english11/10a.html");
                return;
            case "10b":
                this.dataload.loadUrl("file:///android_asset/english11/10b.html");
                return;
            case "10c":
                this.dataload.loadUrl("file:///android_asset/english11/10c.html");
                return;
            case "10d":
                this.dataload.loadUrl("file:///android_asset/english11/10d.html");
                return;
            case "11a":
                this.dataload.loadUrl("file:///android_asset/english11/11a.html");
                return;
            case "11b":
                this.dataload.loadUrl("file:///android_asset/english11/11b.html");
                return;
            case "11c":
                this.dataload.loadUrl("file:///android_asset/english11/11c.html");
                return;
            case "12a":
                this.dataload.loadUrl("file:///android_asset/english11/12a.html");
                return;
            case "12b":
                this.dataload.loadUrl("file:///android_asset/english11/12b.html");
                return;
            case "12c":
                this.dataload.loadUrl("file:///android_asset/english11/12c.html");
                return;
            case "13a":
                this.dataload.loadUrl("file:///android_asset/english11/13a.html");
                return;
            case "13b":
                this.dataload.loadUrl("file:///android_asset/english11/13b.html");
                return;
            case "13c":
                this.dataload.loadUrl("file:///android_asset/english11/13c.html");
                return;
            case "14":
                this.dataload.loadUrl("file:///android_asset/english11/14.html");
                return;
            case "15a":
                this.dataload.loadUrl("file:///android_asset/english11/15a.html");
                return;
            case "15b":
                this.dataload.loadUrl("file:///android_asset/english11/15b.html");
                return;
            case "15c":
                this.dataload.loadUrl("file:///android_asset/english11/15c.html");
                return;
            case "16":
                this.dataload.loadUrl("file:///android_asset/english11/16.html");
                return;
            case "17a":
                this.dataload.loadUrl("file:///android_asset/english11/17a.html");
                return;
            case "17b":
                this.dataload.loadUrl("file:///android_asset/english11/17b.html");
                return;
            case "18":
                this.dataload.loadUrl("file:///android_asset/english11/18.html");
                return;
            case "19":
                this.dataload.loadUrl("file:///android_asset/english11/19.html");
                return;
            case "20":
                this.dataload.loadUrl("file:///android_asset/english11/20.html");
                return;
            case "21":
                this.dataload.loadUrl("file:///android_asset/english11/21.html");
                return;
            case "22":
                this.dataload.loadUrl("file:///android_asset/english11/22.html");
                return;
            case "23":
                this.dataload.loadUrl("file:///android_asset/english11/23.html");
                return;
            default:
                return;
        }
    }
}
