package com.java.revision.CustomExceptions;

import com.java.revision.CustomExceptions.NotAnAdultException;

public class CatchCustom {
    public static void main(String[] args){
        int age = 3;
        try{
            if (!(age>18)){
                throw new NotAnAdultException();
            }
        }catch(NotAnAdultException e){
            System.out.println(e);
        }
    }
}
