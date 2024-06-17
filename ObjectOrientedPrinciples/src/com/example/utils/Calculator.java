package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Area of circle of radius "+ c.getRadius()+" = "+ c.getAreaOfCircle());

        Rectangle r = new Rectangle(7,4);
        System.out.println("Area of rectangle of length= "+ r.getLength()+ ", breadth = "+
                r.getBreadth()+" is "+
                r.getAreaOfRectangle());

    }


}
