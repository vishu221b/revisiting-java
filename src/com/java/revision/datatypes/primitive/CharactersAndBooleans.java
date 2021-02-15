package com.java.revision.datatypes.primitive;

public class CharactersAndBooleans {
    public void runChecks(boolean someInput){
        char a = 'A'; // char is used to store characters, characters are stored as unicode
        boolean someValue = false; // used to store logical values - True or False
        System.out.println(a);
        System.out.println((someValue || someInput) ? "This is true" : "This is false");
    }
}
