package com.java.revision.CustomExceptions;

public class ThrowingExceptions {
    public static void main(String[] args){
        int age = 23;

        if (age>15){
            try{
                throw new ArithmeticException("Throwing arithmetic exception with custom message.");
            }catch(ArithmeticException e){
                System.out.println(e);
            }
        }
    }
}
