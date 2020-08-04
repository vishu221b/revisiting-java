package com.java.revision.CustomExceptions;

public class BasicException {
    public static void main(String[] args){
        int a=10;
        int b=0;
        int[] arr = new int[2];

        try{
            arr[4] = 5;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
