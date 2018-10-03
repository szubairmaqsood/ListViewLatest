package com.example.zubair.listview;

public class Fruits {
    private String name;
   private  int ImageId;

   public Fruits(String name,int imageId)  {
       this.name=name;
       this.ImageId=imageId;


   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}


