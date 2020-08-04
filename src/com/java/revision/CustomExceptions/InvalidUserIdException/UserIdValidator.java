package com.java.revision.CustomExceptions.InvalidUserIdException;

import java.util.Scanner;

public class UserIdValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String userId;
        try{
            System.out.print("Enter your user id: ");
            userId = sc.next();
            System.out.println(userId);
            if(!userId.equalsIgnoreCase("1234")){
                throw new InvalidUserIdException("Invalid user id entered");
            }
        }catch(InvalidUserIdException e){
            System.out.println(e);
        }
    }
}
