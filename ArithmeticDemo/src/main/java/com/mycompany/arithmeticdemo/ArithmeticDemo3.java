package com.mycompany.arithmeticdemo;

import java.util.Scanner;

public class ArithmeticDemo3 {

    public static void main(String[] args) {
                    
        Scanner input = new Scanner(System.in);
        
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        
        System.out.println("Please enter a double -> ");
        firstNumber = input.nextDouble();
        System.out.println("Please enter another double -> ");
        secondNumber = input.nextDouble();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber + secondNumber;
        average = sum / 2;
        
        System.out.println("The sum of " + firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println("The difference between " + firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
    
}
