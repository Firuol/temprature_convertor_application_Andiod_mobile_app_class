package com.example.temprature_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCelsius;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCelsius = findViewById(R.id.editTextCelsius);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertTemperature(View view) {
        try {
            double celsius = Double.parseDouble(editTextCelsius.getText().toString());
            double fahrenheit = (celsius * 9/5) + 32;
            String result = String.format("%.2f Celsius is %.2f Fahrenheit", celsius, fahrenheit);
            textViewResult.setText(result);
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input. Please enter a valid number.");
        }
    }
}
