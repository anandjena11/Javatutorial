package com.exceptionhandling;

public class ExceptionHandlingDemo1 {

    public static void main(String[] args) {
        int a,b,c;
        a = 10;
        b = 0;
        try{
            c = a/b;
            System.out.println("c is: " + c);

            int arr[] = new int[5];
            arr[1] = 20;
            System.out.println(arr[1]);

            String str = "Hello";
            char ch = str.charAt(2);
            System.out.println("ch: " + ch);
        }catch(ArithmeticException e){
            System.out.println("Value of b can not be 0");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong array index");
        }catch(Exception e){
            System.out.println("Error");
        }finally{
            System.out.println("Inside finally block");
        }
    }
}
