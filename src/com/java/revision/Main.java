package com.java.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserInputs userInputs = new UserInputs();
        List<String> newStrings = new ArrayList<>();
        String[] arr = {"Veeshu", "Deeshu", "Java", "Shava"};
        Collections.addAll(newStrings, arr);
        System.out.println(newStrings.size());
        newStrings.forEach(
                (e) -> System.out.println(e+" Printed :D")
        );
        Scanner inputScanner = userInputs.getScanner();
        System.out.print("Gimme an integer input :D => ");
        int someInteger = inputScanner.nextInt();
        System.out.print("Now gimme a String input :D => ");
        String someString = inputScanner.next();
        System.out.println(String.format("User integer is %d and user string is %s.", someInteger, someString));

    }
}
