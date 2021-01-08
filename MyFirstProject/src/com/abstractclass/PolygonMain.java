package com.abstractclass;

public class PolygonMain {
    public static void main(String[] args) {
        Polygon polygon; //reference of Polygon

        //polygon = new Polygon();
        //polygon.calcArea(12.34,10.5);
        //polygon.display();

        polygon = new Rectangle();//upcasting
        polygon.calcArea(12.34,10.5);
        polygon.display();

        polygon = new Triangle();//upcasting
        polygon.calcArea(12.34,10.5);
        polygon.display();
    }
}