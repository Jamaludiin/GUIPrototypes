package com.example.guiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewFactoryLabel;
    private TextView textViewSensorReading1;
    private TextView textViewSensorReading2;
    private TextView textViewSensorReading3;
    private TextView textViewSensorReading4;
    private TextView textViewTotalPower;
    private TextView textViewTimestamp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFactoryLabel = findViewById(R.id.textViewFactoryLabel);
        textViewSensorReading1 = findViewById(R.id.textViewSensorReading1);
        textViewSensorReading2 = findViewById(R.id.textViewSensorReading2);
        textViewSensorReading3 = findViewById(R.id.textViewSensorReading3);
        textViewSensorReading4 = findViewById(R.id.textViewSensorReading4);
        textViewTotalPower = findViewById(R.id.textViewTotalPower);
        textViewTimestamp = findViewById(R.id.textViewTimestamp);

        Button buttonFactory1 = findViewById(R.id.buttonFactory1);
        Button buttonFactory2 = findViewById(R.id.buttonFactory2);
        Button buttonFactory3 = findViewById(R.id.buttonFactory3);

        Button buttonEngineers = findViewById(R.id.buttonEngineers);
        Button buttonDashboard = findViewById(R.id.buttonDashboard);
        Button buttonSettings = findViewById(R.id.buttonSettings);

        buttonFactory1.setOnClickListener(v -> updateFactoryDashboard("Factory 1"));
        buttonFactory2.setOnClickListener(v -> updateFactoryDashboard("Factory 2"));
        buttonFactory3.setOnClickListener(v -> updateFactoryDashboard("Factory 3"));

        buttonEngineers.setOnClickListener(v -> openEngineersPage());
        buttonDashboard.setOnClickListener(v -> openDashboardPage());
        buttonSettings.setOnClickListener(v -> openSettingsPage());
    }

    private void updateFactoryDashboard(String factoryName) {
        textViewFactoryLabel.setText(factoryName);
        // Update sensor readings and other details for the selected factory
        textViewSensorReading1.setText("Sensor 1: " + Math.random() * 100);
        textViewSensorReading2.setText("Sensor 2: " + Math.random() * 100);
        textViewSensorReading3.setText("Sensor 3: " + Math.random() * 100);
        textViewSensorReading4.setText("Sensor 4: " + Math.random() * 100);
        textViewTotalPower.setText("Total Power: " + Math.random() * 2000 + " kW");
        textViewTimestamp.setText("Timestamp: " + System.currentTimeMillis());
    }

    private void openEngineersPage() {
        Toast.makeText(this, "Open Engineers Page", Toast.LENGTH_SHORT).show();
        // Implement navigation to Engineers Page
    }

    private void openDashboardPage() {
        Toast.makeText(this, "Open Dashboard Page", Toast.LENGTH_SHORT).show();
        // Implement navigation to Dashboard Page
    }

    private void openSettingsPage() {
        Toast.makeText(this, "Open Settings Page", Toast.LENGTH_SHORT).show();
        // Implement navigation to Settings Page
    }
}
