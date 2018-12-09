package com.example.mudaris.mudaris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void gotoEnroll(View v){

        Intent i = new Intent(this,enroll.class);
            startActivity(i);
    }
}
