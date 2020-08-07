package com.java.revision.IO.files;

import java.io.IOException;

public class Main {

    public static void main (String[] args){
        ReadMultipleFiles readMultipleFiles = new ReadMultipleFiles();
        try{
            readMultipleFiles.readFileNamesFromUser();
            readMultipleFiles.readMultipleFilesByNames();
        }catch(IOException e){
            e.printStackTrace();
        }
//        ReadSomeFile readSomeFile = new ReadSomeFile("src/com/java/revision/IO/files/scratch.txt");
//        try{
//            readSomeFile.readFileAndDisplayOutput();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
    }
}
