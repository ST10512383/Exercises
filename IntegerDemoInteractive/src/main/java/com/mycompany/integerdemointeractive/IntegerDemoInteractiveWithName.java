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
        
        System.out.print("Please enter a Short integer > ");
        aLong = userInput.nextLong();
        
        System.out.print("Please enter your name > ");
        userInput.nextLine();
        name = userInput.nextLine();
        System.out.println("Thank you, " + name);
        
        userInput.close();
    }
}
