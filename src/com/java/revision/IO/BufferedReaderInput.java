package com.java.revision.IO;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Two types of streams-
 * Byte - Used for handling the input and output of bytes, reading binary data
 * Character - Used for handling input and output of characters, they use Unicode
 * */
public class BufferedReaderInput {
    public static void main (String[] args){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); // to pass stream reader to buffered reader
        PrintWriter printWriter = new PrintWriter(System.out, true); // For writing to console
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // For reading the input stream
        String outputString;
        try{
            System.out.print("Please provide an inout stream -> ");
            outputString = bufferedReader.readLine();
            printWriter.println("Output Stream -> " + outputString);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
