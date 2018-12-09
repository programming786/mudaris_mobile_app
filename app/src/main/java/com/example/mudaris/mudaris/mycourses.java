package com.example.mudaris.mudaris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mycourses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycourses);
    }

    public void gotocontent(View v){

        Intent i = new Intent(this,content.class);
        startActivity(i);
    }
}
