package com.java.revision.CustomExceptions.NegativeDepositExceptionHandler;

import com.java.revision.CustomExceptions.NegativeNotAllowedException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double depositAmount, currentBalance;
        System.out.print("Enter your current bank balance: ");
        currentBalance = scanner.nextDouble();
        System.out.print("Enter your deposit amount: ");
        depositAmount = scanner.nextDouble();
        try{
            if (depositAmount > 0){
                currentBalance += depositAmount;
                System.out.println("You current balance becomes: "+currentBalance);
            }else{
                throw new NegativeNotAllowedException();
            }
        }catch(NegativeNotAllowedException n){
            System.out.println(n);
        }
    }
}
