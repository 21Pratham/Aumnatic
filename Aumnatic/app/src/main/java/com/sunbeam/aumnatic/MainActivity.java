package com.sunbeam.aumnatic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText editEmail , editPassword;
Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editEmail = findViewById(R.id.enterEmail);
        editPassword = findViewById(R.id.enterPassword);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener( v -> {
            String Email = editEmail.getText().toString().trim();
            String Password = editPassword.getText().toString().trim();
            if (Email.isEmpty() || Password.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter both fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, FareCalculator.class);
                startActivity(intent);
            }
        });

    }
}