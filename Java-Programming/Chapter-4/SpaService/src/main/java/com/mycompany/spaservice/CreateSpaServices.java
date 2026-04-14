package com.mycompany.spaservice;

// Import Scanner package
import java.util.Scanner;

public class CreateSpaServices {
    
    public static void main(String[] arg) {
        // Declare variables
        String service;
        double price;
        
        // Instantiate two service objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        
        // Instantiate Scanner to take keyboard input from user
        Scanner userInput = new Scanner(System.in);
        
        // Prompt the user for input using Scanner
        System.out.println("Enter Service >> ");
        service = userInput.nextLine();
        System.out.println("Enter Price >> ");
        price = userInput.nextDouble();
        
        // Call firstService object and pass service variable to setServiceDescription method
        firstService.setServiceDescription(service);
        // Call firstService object and pass price variable to setPrice method
        firstService.setPrice(price);
    }
}
