package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Michael Kisida
 */



import java.util.Scanner;


public class TempConverter
{
    public static int celsius(int x){

        return (x-32) * 5/9;
    }
    public static int fahrenheit(int x){

        return (x * 9/5) +32;
    }
    public static void main( String[] args ) {
        String output1 = " ";
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int temperature;
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String choice = input.nextLine();  // Read user input
        String CHOICE = choice.toUpperCase();
        if (CHOICE.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            int celsiusTemp = input.nextInt();
            temperature = fahrenheit(celsiusTemp);
            output1 = String.format("The temperature in Fahrenheit is %d", temperature);
        }
        else if (CHOICE.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit");
            int FTemp = input.nextInt();
            temperature = celsius(FTemp);
            output1 = String.format("The temperature in Celsius is %d", temperature);

        }



        System.out.println(output1);
        input.close();
    }

}
