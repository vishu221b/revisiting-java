package com.java.revision.DataStructures;

public class MainClassRunner {
    public static void main(String[] args) throws Exception {
        CustomStackImplementation customStackImplementation = new CustomStackImplementation(4);
        customStackImplementation.push("This is a string.");
        customStackImplementation.push(234);
        customStackImplementation.push(234);
        customStackImplementation.push(234);
        customStackImplementation.printAllElements();
        customStackImplementation.pop(1);
        customStackImplementation.pop(1);
        customStackImplementation.pop(1);
        customStackImplementation.pop(1);
        customStackImplementation.printAllElements();
        customStackImplementation.top();
    }
}
