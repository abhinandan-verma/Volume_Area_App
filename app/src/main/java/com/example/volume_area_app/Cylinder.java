package com.example.volume_area_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cylinder extends AppCompatActivity {

    TextView title,result;
    EditText radius,height;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        title = findViewById(R.id.cylinder_text);
        radius = findViewById(R.id.cylinder_edit1);
        height = findViewById(R.id.cylinder_edit2);
        btn = findViewById(R.id.cylinder_btn);
        result = findViewById(R.id.cylinder_result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rad= radius.getText().toString();
                double r = Double.parseDouble(rad);
                String heit = height.getText().toString();
                double h = Double.parseDouble(heit);
                double volume = 3.14159*r*r*h;
                result.setText("V =\n"+volume+" m^3");
            }
        });
    }
}