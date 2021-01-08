package com.stringtest;

public class StringDemo {
    public static void main(String[] args) {
        //declare a string
        String greeting = "Hello world!";

        //find out string length
        int length = greeting.length();
        System.out.println( "String Length is : " + length );

        //concatinate strings
        String outputString = "My name is ".concat("Zara");
        System.out.println(outputString);

        String upperCase = outputString.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = upperCase.toLowerCase();
        System.out.println(lowerCase);
    }
}
