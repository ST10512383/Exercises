package com.mycompany.integerdemointeractive;

import java.util.Scanner;

public class IntegerDemoInteractive {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        
        System.out.print("Please enter an Integer > ");
        anInt = userInput.nextInt();
        
        System.out.print("Please enter a Byte integer > ");
        aByte = userInput.nextByte();
        
        System.out.print("Please enter a Short integer > ");
        aLong = userInput.nextLong();
        
        userInput.close();
    }
}
