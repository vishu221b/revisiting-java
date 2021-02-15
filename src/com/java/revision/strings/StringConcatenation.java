package com.java.revision.strings;

public class StringConcatenation {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirstString");
        stringBuilder.append("SecondString");
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(10, "::AFTERfIRSTsTRING::"); //Position of the inserted string starts from offset
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(0, 4); // Doesn't include toPosition
        System.out.println(stringBuilder.toString());

        String someString = "This is a big big string.";
        someString = someString.replaceAll(" ", "");
        System.out.println(someString.length());
    }
}
