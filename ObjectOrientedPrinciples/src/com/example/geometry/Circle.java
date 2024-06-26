package com.example.geometry;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    public double getAreaOfCircle(){
        return Math.PI * Math.pow(radius, 2) ;
    }


}
