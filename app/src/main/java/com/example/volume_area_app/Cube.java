package com.example.volume_area_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cube extends AppCompatActivity {

    TextView title,result;
    EditText edit;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        title = findViewById(R.id.cube_title);
        result = findViewById(R.id.cube_result);
        edit = findViewById(R.id.cube_edit);
        btn = findViewById(R.id.cube_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edge = edit.getText().toString();
                float e = Integer.parseInt(edge);
                float vol = e*e*e;
                result.setText("V =\n"+vol+" m^3");
            }
        });
    }
}