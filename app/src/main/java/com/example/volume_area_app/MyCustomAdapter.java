package com.example.volume_area_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//This class will be responsible for creating
//the view for each item and binding data to it
public class MyCustomAdapter extends ArrayAdapter<Shape> {

    Context context;
    private ArrayList<Shape> shapeArrayList;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //1- Get the shape object for the current position
        Shape shape = getItem(position);
        //2- Inflating layout
        MyViewHolder myViewHolder;
        if(convertView == null){
          myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            //Finding the Views
            myViewHolder.shapeName = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(myViewHolder);
        }else{
        //a view went off-screen --> re-use it
        myViewHolder = (MyViewHolder) convertView.getTag();
        }
        //Getting the data from model
        myViewHolder.shapeName.setText(shape.getShapeName());
        myViewHolder.shapeImg.setImageResource(shape.getShapeImg());
        return convertView;
    }
    //GetView(): used to crete and return a view for a specific item in Grid

    //View Holder: Used to cache references to the views within an item layout
    private static class MyViewHolder{
        TextView shapeName;
        ImageView shapeImg;
    }
}
