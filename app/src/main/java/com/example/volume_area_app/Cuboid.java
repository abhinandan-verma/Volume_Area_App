package com.example.volume_area_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cuboid extends AppCompatActivity {

    TextView title,result;
    EditText length,breadth,height;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);

        title = findViewById(R.id.cuboid_title);
        length = findViewById(R.id.cuboid_edit1);
        breadth = findViewById(R.id.cuboid_edit2);
        height = findViewById(R.id.cuboid_edit3);
        btn = findViewById(R.id.cuboid_btn);
        result = findViewById(R.id.cuboid_result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String len = length.getText().toString();
                double l = Double.parseDouble(len);
                String bred = breadth.getText().toString();
                double b = Double.parseDouble(bred);
                String heit = height.getText().toString();
                double h = Double.parseDouble(heit);
                double volume = l*b*h;
                result.setText("V =\n"+volume+" m^3");

            }
        });

    }
}