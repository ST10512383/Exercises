package com.mycompany.chardemo;

public class CharDemo {

    public static void main(String[] args) {
        // Declate a var with data type char
        char initial = 'A';
        
        // Print a char
        System.out.println(initial);
        
        // Print string using escape sequences
        System.out.println("\tabc\ndef\n\tghi\njkl");
        
        // Print a text block
        String block = 
                """
                \nHello
                there
                friend!
                """;
        System.out.println(block);
        
    }
}
