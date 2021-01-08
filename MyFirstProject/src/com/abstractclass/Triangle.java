package com.abstractclass;

public class Triangle extends Polygon{
    @Override
    public void calcArea(double l, double b) {
        area = l * b * 0.5;
    }
}
