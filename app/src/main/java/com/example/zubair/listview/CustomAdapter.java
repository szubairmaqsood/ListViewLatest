package com.example.zubair.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.lang.String.*;

public class CustomAdapter extends ArrayAdapter<Fruits> {

    private LayoutInflater mInflater;

    //Need to remmeber a thing that there is not default constructor avaible in Array Adapter so
      // need to call it explicitly and to definde also constructor of child class as well

   public  CustomAdapter(Context context, int resource, ArrayList<Fruits> myObjects)
   {
       super(context,resource,myObjects);



   }

   /*
   position:poisition of item whose data we want to fill
     View gROUP OUR ITEM WILL ATTACH TO WHICH LIST VIEW
      CONVERT ALREADY PRESNT OR GET NEW ONE
      parent view our list view


    */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // LayoutInflater.from(getContext()).inflate(R.layout.single_item,parent,false);
       // LayoutInflater.inflate(convertView, parent, false);
        LayoutInflater li = LayoutInflater.from(getContext());
        //View view = getLayoutInflater().inflate(R.layout.hidden_layout, main,false);



        // Get the data item for this position
        Fruits Item = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView  = li.inflate(R.layout.single_item,null,false);
        }
        // Lookup view for data population
        TextView tv1 = (TextView) convertView.findViewById(R.id.textView1);
        ImageView iM1 = (ImageView) convertView.findViewById(R.id.ImageView1);
        // Populate the data into the template view using the data object
        tv1.setText(Item.getName());
        iM1.setImageResource(Item.getImageId());
        // Return the completed view to render on screen
        return convertView;
    }






}
