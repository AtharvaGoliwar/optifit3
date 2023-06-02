package com.example.optifit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edUsername, edPassword;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUsername = findViewById(R.id.editTextTextEmailAddress);
        edPassword = findViewById(R.id.editTextTextPassword);
        btn = findViewById(R.id.buttonlogin);
        //tv = findViewById(R.id.textV);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                if (username.length() == 0 || password.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill All details", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, home.class));
                }
            }
        });
    }
//        tv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick() {
//                startActivity(new Intent(LoginActivity.this, home.class));
//            }
//
//    });

}