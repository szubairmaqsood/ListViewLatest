package com.example.zubair.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int numberofItems=4;

    String[] fruitArray = new String[] {"Apple", "Banana", "Orange", "Grapes"};  //It is data set to show ot we added a
                                                                                 // list in our activity and alos make a layout
                                                                               //            file fro single item
    int []flags={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four};

    ArrayList<Fruits> TotalList=new ArrayList<>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Array adapter will take data and will pack each item in data as layout file and provide it to our xml list
        //in simple cases by dafault it uses tostring method and give given data array to a text view

        // Array adapter takes three parameter context ,our single item in list xml file, and our data

         /*
      ArrayAdapter<String>Adapter1 =new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, fruitArray);
       */

         for(int i=0;i<numberofItems;i++)
         TotalList.add(new Fruits(fruitArray[i],flags[i]));

         CustomAdapter Adapter2=new CustomAdapter(this,android.R.layout.simple_list_item_single_choice,TotalList);
        ListView MyList=(ListView)findViewById(R.id.List);
        MyList.setAdapter(Adapter2);

    }
}
