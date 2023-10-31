package com.example.volume_area_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cone extends AppCompatActivity {
    TextView title,result;
    EditText radius,height;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);

        title = findViewById(R.id.cone_title);
        radius = findViewById(R.id.cone_radius);
        height = findViewById(R.id.cone_height);
        btn = findViewById(R.id.cone_btn);
        result = findViewById(R.id.cone_result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rad = radius.getText().toString();
                double r = Double.parseDouble(rad);
                String heit = height.getText().toString();
                double h = Double.parseDouble(heit);
                double volume = 1.0472*r*r*h;
                result.setText("V =\n"+volume+" m^3");
            }
        });
    }
}