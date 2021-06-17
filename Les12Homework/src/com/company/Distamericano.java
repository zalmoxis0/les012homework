package com.company;

import java.util.Scanner;

public class Distamericano {
    public static void main(String[] args) {
        // make a scanner to record the user input of fahrenheit
        Scanner inchesScanner = new Scanner(System.in);

        // Ask the user to insert the amount of Fahrenheit
        System.out.println("Please enter the amount of inches");

        // declare the inches scanner
        double inchesObject = inchesScanner.nextDouble();

        // declare variable celsius + calculate Fahrenheit to celsius
        double meters = inchesObject * 0.0254;

        System.out.println("The total inches is = to " + meters + "m");


    }
}
