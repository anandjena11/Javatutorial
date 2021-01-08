package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<Integer>();

        //add elements to arraylist
        System.out.println("Size: " + arl.size());
        System.out.println(arl);
        arl.add(10);//autoboxing from jdk 1.5
        arl.add(new Integer(20));//till jdk1.4
        System.out.println("Size: " + arl.size());
        System.out.println(arl);
        arl.add(60);

        //insert operation
        arl.add(1,40);
        System.out.println("Size: " + arl.size());
        System.out.println(arl);

        //delete operation
        arl.remove(2);
        System.out.println("Size: " + arl.size());
        System.out.println(arl);


        //search operation
        boolean isAvailable = arl.contains(60);
        if(isAvailable)
            System.out.println("Element present");
        else
            System.out.println("Element not present");

        //various ways to iterate
        int sum = 0;
        for (int i = 0; i < arl.size(); i++) {
            sum += arl.get(i);
        }
        System.out.println("Sum: " + sum);

        sum = 0;
        for (Integer integer : arl) {
            sum += integer;
        }
        System.out.println("Sum: " + sum);

        sum = 0;
        Iterator<Integer> itr = arl.iterator();
        while(itr.hasNext()){
            sum += itr.next();
        }
        System.out.println("Sum: " + sum);
    }
}
