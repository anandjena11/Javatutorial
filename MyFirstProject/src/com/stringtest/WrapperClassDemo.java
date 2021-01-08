package com.stringtest;

public class WrapperClassDemo {
    Integer ten = new Integer(10); //boxing
    Integer twenty = 20; //autoboxing

    //Integer is wrapper class for int

    int value1 = ten.intValue(); //unboxing
    int value2 = twenty; //autounboxing
}