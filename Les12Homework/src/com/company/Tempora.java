package com.company;

import java.util.Scanner;

public class Tempora {
    public static void main(String[] args) {
        System.out.println("Tempora!");




        // make a scanner to record the user input of fahrenheit
        Scanner fahrenheitScanner = new Scanner(System.in);

        // Ask the user to insert the amount of Fahrenheit
        System.out.println("Please enter the amount of Fahrenheit");

        // declare the fahrenheitScanner
        double fahrenheitObject = fahrenheitScanner.nextDouble();

        // declare variable celsius + calculate Fahrenheit to celsius
        double celsius = (fahrenheitObject-32) / 1.80;

        // Print out the calculation with a message
        System.out.println("The total fahrenheit is equal to " + celsius + "fahrenheit");

    }
}
