package com.athon.hack.parkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        int a = 6;
        a++;
    }
}