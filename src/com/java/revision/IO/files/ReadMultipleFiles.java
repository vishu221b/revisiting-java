package com.java.revision.IO.files;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadMultipleFiles {

    final private String ASK_USER_FOR_FILE_NAMES = "Please enter comma separated file names: ";

    private List<String> fileNamesList;

    public void readFileNamesFromUser() throws IOException {
        System.out.print(ASK_USER_FOR_FILE_NAMES);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        fileNamesList = Arrays.asList(bufferedReader.readLine().split(",", -1));
//        System.out.println("Length is->" + fileNamesList.size());
        fileNamesList = fileNamesList.stream()
                .filter(value ->
                    !(value.length()<1))
                .collect(Collectors.toList()); //Filtering for null strings
        System.out.println("Entered Files names to read are: ");
        for(String fileName: fileNamesList){
            System.out.println(fileName.trim());
        }
        System.out.println("-------------------------");
    }

    public void readMultipleFilesByNames() throws IOException {
        for(String file: fileNamesList){
            try{
                String fileNameForRead = "src/com/java/revision/IO/files/" + file.trim();
                FileInputStream fileInputStream = new FileInputStream(fileNameForRead);
                int dataByte = fileInputStream.read();
                StringBuilder fileContent = new StringBuilder();
                while(dataByte != -1){
                    fileContent.append((char) dataByte);
                    dataByte = fileInputStream.read();
                }
                System.out.println("====================================");
                System.out.println("Contents of file \"" + file + "\" are:");
                System.out.println(fileContent);
                System.out.println("====================================");
                fileInputStream.close();
                fileContent.delete(0, fileContent.length());
            }catch (FileNotFoundException e){
                System.out.println(String.format("File %s not found, reading next file.", file.trim()));
            }
        }
    }
}
