package com.java.revision.datatypes;

import com.java.revision.datatypes.primitive.CharactersAndBooleans;
import com.java.revision.datatypes.primitive.DecimalDataTypes;
import com.java.revision.datatypes.primitive.IntegerDataTypes;

/**
 * Primitive Data types -  Java's Built in Data types
 * Eight types - byte, short, int, double, char, float, long, boolean
 * Integers - byte, short, int, long
 * Decimals - float, double
 * Boolean - boolean
 * Characters - char
*/
public class DataTypes {
    public static void main(String[] args){
    IntegerDataTypes integerDataTypes = new IntegerDataTypes();
    DecimalDataTypes decimalDataTypes = new DecimalDataTypes();
    CharactersAndBooleans charactersAndBooleans = new CharactersAndBooleans();
    System.out.println("----Integers----");
    integerDataTypes.runIntegerTypeChecks();
    System.out.println("----Decimals----");
    decimalDataTypes.runDecimalChecks();
    System.out.println("----Characters and Booleans----");
    charactersAndBooleans.runChecks(true);
    }
}
