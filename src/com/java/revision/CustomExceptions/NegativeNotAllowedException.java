package com.java.revision.CustomExceptions;

public class NegativeNotAllowedException extends Exception {
    public NegativeNotAllowedException(){
        super("Negative deposits are not allowed.");
    }
}
