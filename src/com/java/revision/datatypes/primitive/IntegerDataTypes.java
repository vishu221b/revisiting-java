package com.java.revision.datatypes.primitive;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

public class IntegerDataTypes {

    public void runIntegerTypeChecks(){
        try{
            byte byteDataType = 127; // byte range is -128 to 127
            short shortDataType = 32767; //short range is -32768 to 32767
            int intDataType = 2147483647; // int range is from -2147483648 to 2147483647
            long longDataType = 9223372036854775807l; // long range is -9223372036854775808 to 9223372036854775807
            System.out.println(byteDataType);
            System.out.println(shortDataType);
            System.out.println(intDataType);
            System.out.println(longDataType);
        }
        catch(Exception e){
            System.out.println();
            throw e;
        }
    }
}
