package com.athon.hack.parkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConnectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
        Button logInButton = (Button) findViewById(R.id.button);
        Button registerButton = (Button) findViewById(R.id.button2);
//        logInButton.setOnClickListener(new OnClickListener()
//        {
//            public void onClick(View v)
//            {
//            startActivity(new Intent(ConnectActivity.this, LogInActivity.class));
//            }
//        });
    }
    public void toLogIn (View view)
    {
        startActivity(new Intent(ConnectActivity.this, LogInActivity.class));
    }

    public void toRegister (View view)
    {
        startActivity(new Intent(ConnectActivity.this, RegisterActivity.class));
    }
}
