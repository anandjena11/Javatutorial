package com.abstractclass;

public abstract class Polygon {
    double area;
    public abstract void calcArea(double l, double b);

    public void display(){
        System.out.println("Area is: " + area);
    }
}
