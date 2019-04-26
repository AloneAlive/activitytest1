package com.example.ts.activitytest1;

public class Fruit {
    /*
    水果名字
     */
    private String name;

    /*
    水果id
     */
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
