package com.example.apptpsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textName = findViewById(R.id.txtLoginInfo);
        TextView textPass = findViewById(R.id.txtPasswordInfo);

        Bundle bundle = getIntent().getExtras();

        String usernameInfo = bundle.getString("username");
        String passwordInfo = bundle.getString("password");

        textName.setText(usernameInfo);
        textPass.setText(passwordInfo);


    }

    public void retourHome(View view){
        Intent retourIntent = new Intent(this,MainActivity.class);
        startActivity(retourIntent);
    }
}