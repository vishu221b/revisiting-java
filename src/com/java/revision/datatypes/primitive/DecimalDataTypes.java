package com.java.revision.datatypes.primitive;

public class DecimalDataTypes {
    private float floatDataType;
    private double doubleDataType;

    public void runDecimalChecks(){
        floatDataType = 1.23f ; // f needs to be specified for float else java will interpret it as double - 7 digits allowed after decimal
        doubleDataType = 1.222222222223123213123123212; // value will be rounded off where it exceeds the certain limit
        System.out.println(floatDataType);
        System.out.println(doubleDataType);
    }
}
