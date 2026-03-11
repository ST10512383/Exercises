package com.mycompany.arithmeticdemo;

import java.util.Scanner;

public class ArithmeticDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;
        
        System.out.println("Please enter the fist number -> ");
        firstNumber = input.nextInt();
        System.out.println("Please enter the second number -> ");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber + secondNumber;
        average = sum / 2;
        
        System.out.println("The sum of " + firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println("The difference between " + firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
}
