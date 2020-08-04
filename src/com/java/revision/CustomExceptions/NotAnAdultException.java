package com.java.revision.CustomExceptions;

public class NotAnAdultException extends Exception {
    @Override
    public String toString(){
        return "NotAnAdultException: Not an adult!";
    }
}
