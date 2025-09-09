package com.sunbeam.aumnatic;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FareCalculator extends AppCompatActivity {
    EditText ticketInput;
    Button calcButton;
    TextView fareResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_calculator); // fare calculator XML

        ticketInput = findViewById(R.id.editTicket);
        calcButton = findViewById(R.id.editButton);
        fareResult = findViewById(R.id.editTicket);

        calcButton.setOnClickListener(v -> {
            String tickets = ticketInput.getText().toString().trim();

            if (tickets.isEmpty()) {
                Toast.makeText(FareCalculator.this, "Enter number of tickets", Toast.LENGTH_SHORT).show();
            } else {
                int fare = Integer.parseInt(tickets) * 50;
                fareResult.setText("Total Fare: ₹" + fare);
            }
        });
    }
}