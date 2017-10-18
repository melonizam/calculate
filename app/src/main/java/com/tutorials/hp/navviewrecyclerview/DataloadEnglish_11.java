package com.tutorials.hp.navviewrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class DataloadEnglish_11 extends Fragment {
    WebView dataload;

    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dataload, container, false);
        this.dataload = (WebView) v.findViewById(R.id.webview);
        this.dataload.getSettings().setJavaScriptEnabled(true);
        this.dataload.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        return v;
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        switch (getArguments().getInt("key")) {
            case 0:
                this.dataload.loadUrl("file:///android_asset/english11/unit.html");
                return;
            case 1:
                this.dataload.loadUrl("file:///android_asset/english11/unit1.html");
                return;
            case 2:
                this.dataload.loadUrl("file:///android_asset/english11/unit3.html");
                return;
            case 3:
                this.dataload.loadUrl("file:///android_asset/english11/unit4.html");
                return;
            case 4:
                this.dataload.loadUrl("file:///android_asset/english11/unit5.html");
                return;
            case 5:
                this.dataload.loadUrl("file:///android_asset/english11/unit6.html");
                return;
            case 6:
                this.dataload.loadUrl("file:///android_asset/english11/unit7.html");
                return;
            case 7:
                this.dataload.loadUrl("file:///android_asset/english11/unit8.html");
                return;
            case 8:
                this.dataload.loadUrl("file:///android_asset/english11/unit9.html");
                return;
            case 9:
                this.dataload.loadUrl("file:///android_asset/english11/unit10.html");
                return;
            case 10:
                this.dataload.loadUrl("file:///android_asset/english11/unit11.html");
                return;
            case 11:
                this.dataload.loadUrl("file:///android_asset/english11/unit12.html");
                return;
            case 12:
                this.dataload.loadUrl("file:///android_asset/english11/unit13.html");
                return;
            case 13:
                this.dataload.loadUrl("file:///android_asset/english11/unit14.html");
                return;
            case 14:
                this.dataload.loadUrl("file:///android_asset/english11/unit15.html");
                return;
            case 15:
                this.dataload.loadUrl("file:///android_asset/english11/unit16.html");
                return;
            case 16:
                this.dataload.loadUrl("file:///android_asset/english11/unit17.html");
                return;
            case 17:
                this.dataload.loadUrl("file:///android_asset/english11/unit18.html");
                return;
            case 18:
                this.dataload.loadUrl("file:///android_asset/english11/unit19.html");
                return;
            case 19:
                this.dataload.loadUrl("file:///android_asset/english11/unit20.html");
                return;
            case 20:
                this.dataload.loadUrl("file:///android_asset/english11/unit21.html");
                return;
            default:
                return;
        }
    }
}
