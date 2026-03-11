package com.mycompany.quartstogallons;

import java.util.Scanner;

public class QuartsToGallons {

    public static void main(String[] args) {
        final double QUARTS = 4;
        Scanner input = new Scanner(System.in);
        
        System.out.println("What are the quarts needed? ");
        
        double quartsNeeded = input.nextDouble();
        double leftOverQuarts = ((quartsNeeded / QUARTS) - 4) * 4;
        
        System.out.println("A job that needs " + (int) quartsNeeded + " quarts requires " + (int) QUARTS + " gallons plus " + (int) leftOverQuarts + " quarts");
    }
}
