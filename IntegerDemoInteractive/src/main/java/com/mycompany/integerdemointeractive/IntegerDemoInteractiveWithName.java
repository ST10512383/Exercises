package com.mycompany.integerdemointeractive;

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        String name;
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        
        System.out.print("Please enter an Integer > ");
        anInt = userInput.nextInt();
        
        System.out.print("Please enter a Byte integer > ");
        aByte = userInput.nextByte();
        
        System.out.println("Please enter a Short integer > ");
        aShort = userInput.nextShort();
        
        System.out.print("Please enter a Long integer > ");
        aLong = userInput.nextLong();
        
        System.out.print("Please enter your name > ");
        userInput.nextLine();
        name = userInput.nextLine();
        System.out.println("Thank you, " + name);
        
        System.out.println("The Int is " + anInt);
        System.out.println("The Byte is " + aByte);
        System.out.println("The Short is " + aShort);
        System.out.println("The Long is " + aLong);
        
        userInput.close();
    }
}
