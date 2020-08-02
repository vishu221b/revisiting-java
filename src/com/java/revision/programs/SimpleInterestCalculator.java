package com.java.revision.programs;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        double principal, rate, amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        principal = sc.nextDouble();
        System.out.print("Enter the Rate: ");
        rate = sc.nextDouble();
        System.out.print("Enter the Amount: ");
        amount = sc.nextDouble();
        double simpleInterest = (principal * rate * amount) / 100;
        System.out.println("Simple Interest calculated is: " + simpleInterest);
    }
}
