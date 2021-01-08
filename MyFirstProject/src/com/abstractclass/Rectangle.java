package com.abstractclass;

public class Rectangle extends Polygon{
    @Override
    public void calcArea(double l, double b) {
        area = l * b;
    }
}
