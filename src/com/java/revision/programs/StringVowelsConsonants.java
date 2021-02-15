package com.java.revision.programs;

public class StringVowelsConsonants {

    private static String[] testCases = {
            "HellO",
            "there is a quiet Mouse",
            "I am happy",
            "Check Vowels and Consonants Altogether :D"
    };

    private static void runTestCases(){
        StringVowelsConsonants stringVowelsConsonants = new StringVowelsConsonants();
        for(String string: StringVowelsConsonants.testCases){
            System.out.println(stringVowelsConsonants.checkCharacterType(string));
        }
    }

    private Boolean isLowerCaseVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private String checkCharacterType(String s){
        int vowelsCount = 0, consonantsCount = 0 ;
        System.out.println(s.trim());
        char cat = 'c';
        System.out.println(s.indexOf(cat));
        String secondString = s.toLowerCase().replaceAll(" ", "");
        char[] stringToChar = secondString.toCharArray();
        for(char c: stringToChar){
            if (isLowerCaseVowel(c)){
                vowelsCount++;
            }else{
                consonantsCount++;
            }
        }
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder();
        stringBuilder.append("There are ");
        stringBuilder.append(vowelsCount);
        stringBuilder.append(" vowels and ");
        stringBuilder.append(consonantsCount);
        stringBuilder.append(" Consonants in string ->");
        stringBuilder.append(s);
        stringBuilder.append("<-.");
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        runTestCases();
        SimpleInterestCalculator[] arrayOfMyTypeClass = new SimpleInterestCalculator[5]; // Hm works :))
        System.out.println(arrayOfMyTypeClass.length);;
    }
}
