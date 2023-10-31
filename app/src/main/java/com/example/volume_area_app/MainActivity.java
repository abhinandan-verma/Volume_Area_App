package com.example.volume_area_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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
        Shape s4 = new Shape(R.drawable.cuboid,"Cuboid");
        Shape s5 = new Shape(R.drawable.cone,"Cone");

        shapeArrayList.add(s1);
        shapeArrayList.add(s2);
        shapeArrayList.add(s3);
        shapeArrayList.add(s4);
        shapeArrayList.add(s5);

        adapter = new MyCustomAdapter(shapeArrayList,getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0 : Intent i1 = new Intent(getApplicationContext(),Sphere.class);
                       startActivity(i1);
                       break;
                   case 1 :  Intent i2 = new Intent(getApplicationContext(),Cube.class);
                       startActivity(i2);
                       break;
                   case 3 :  Intent i3 = new Intent(getApplicationContext(),Cuboid.class);
                       startActivity(i3);
                       break;
                   case 2 : Intent i4 = new Intent(getApplicationContext(), Cylinder.class);
                       startActivity(i4);
                       break;
                   case 4 : Intent i5 = new Intent(getApplicationContext(), Cone.class);
                        startActivity(i5);
                        break;
                   default :
                       Toast.makeText(
                               MainActivity.this,
                               "Illegal Entry",
                               Toast.LENGTH_SHORT
                       ).show();

            }
        }


});
    }
}