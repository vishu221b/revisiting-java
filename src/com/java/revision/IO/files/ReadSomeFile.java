package com.java.revision.IO.files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

class ReadSomeFile{
    private String fileName;


    public ReadSomeFile(String filename){
        this.fileName = filename;
    }

    public void readFileAndDisplayOutput() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int value = fileInputStream.read(); //Reads the bytes from the file byte by byte and single byte value can be stored as int
        while(value != -1) {//EOF means the value has -1 stored inside it
            System.out.println((char)value + " -> " + value); //Prints value -> byte representation of value
            value = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
