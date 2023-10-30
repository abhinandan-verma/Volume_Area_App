package com.example.volume_area_app;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //1- AdapterView: GridView
    GridView gridView;

    //Data Source: ArrayList<Shape>
    ArrayList<Shape> shapeArrayList;

    //3- Adapter: MyCustomAdapter
    MyCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();
        Shape s1 = new Shape(R.drawable.sphere2,"Sphere");
        Shape s2 = new Shape(R.drawable.cube,"Cube");
        Shape s3 = new Shape(R.drawable.cylinder,"Cylinder");
        Shape s4 = new Shape(R.drawable.cuboid,"Prism");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);

        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

    }
}