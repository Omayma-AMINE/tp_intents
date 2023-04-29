package com.example.apptpsplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();

    }

    public void submit(View view){

        EditText inputUserName = findViewById(R.id.editTextLogin);
        EditText inputPassword = findViewById(R.id.editTextPassword);

        Intent loginIntent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();

        bundle.putString("username",inputUserName.getText().toString());
        bundle.putString("password",inputPassword.getText().toString());

        loginIntent.putExtras(bundle);
        startActivity(loginIntent);
    }
    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();

    }
}