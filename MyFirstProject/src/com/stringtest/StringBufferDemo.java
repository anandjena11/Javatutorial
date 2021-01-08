package com.stringtest;

public class StringBufferDemo {
    public static void main(String[] args) {
        //create StringBuffer object
        StringBuffer buffer = new StringBuffer(" test");

        //append functionality
        buffer.append(" String Buffer");
        System.out.println(buffer);

        //reverse functionality
        buffer.reverse();
        System.out.println(buffer);

        //delete functionality
        buffer.delete(3,7);
        System.out.println(buffer);

        //insert functionality
        buffer.insert(3,"123");
        System.out.println(buffer);

        //replace functionality
        buffer.replace(3, 8, "ZARA");
        System.out.println(buffer);
    }

}
