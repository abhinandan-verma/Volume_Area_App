package com.example.volume_area_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sphere extends AppCompatActivity {

    EditText sphere_radius;
    TextView title, result;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphere_radius = findViewById(R.id.sphereEdit);
        title = findViewById(R.id.sphereText);
        result = findViewById(R.id.sphere_result);
        btn = findViewById(R.id.sphereBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphere_radius.getText().toString();
                int r = Integer.parseInt(radius);
                double volume = (4/3)*3.14159*r*r*r;
                result.setText("V =\n"+volume+" m^3");
            }
        });
    }
}