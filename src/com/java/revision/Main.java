package com.java.revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> newStrings = new ArrayList<>();
        String[] arr = {"Veeshu", "Deeshu", "Java", "Shava"};
        Collections.addAll(newStrings, arr);
        System.out.println(newStrings.size());
        newStrings.forEach(
                (e) -> System.out.println(e+" Printed :D"));
    }
}
