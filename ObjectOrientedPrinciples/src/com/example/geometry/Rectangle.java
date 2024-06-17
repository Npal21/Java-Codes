package com.example.geometry;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    void setLength(int length){
        this.length = length;
    }
    void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public double getAreaOfRectangle(){
        return length*breadth;
    }

}
