package com.tutorials.hp.navviewrecyclerview.Recycleradapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tutorials.hp.navviewrecyclerview.MainActivity;
import com.tutorials.hp.navviewrecyclerview.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void doLogin(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }
}
