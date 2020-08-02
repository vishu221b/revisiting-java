package com.java.revision.datatypes.nonprimitive;

/**
 * Two steps in creating an array:
 * Declare Array: type variable_name [];
 * Allocating memory to the array:
 * variable_name = new type[size];
 * */

public class ArrayDataType {
    public static void main(String[] args){
        //Creating an Int array
        int[] score; // Declaration
        score = new int[10]; // Memory allocation
        score[0] = 12; // values are accessed or assigned using the index-position of the element inside the array
        score[3] = 113413412;
        score[5] = 1204234;
        int count = 89137498;
        int secondScoreArray[] = {100,200,300,400,500,600};
        for (int value : score) {
            if(value == 0){
                value = count;
                count+=12987;
            }
            System.out.println(value);
        }
        System.out.println("Second Arrays elements");
        for (int value: secondScoreArray){
            System.out.println(value);
        }
    }
}
