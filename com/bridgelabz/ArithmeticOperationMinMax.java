package com.bridgelabz;

import java.util.Scanner;

public class ArithmeticOperationMinMax {



        Scanner scnr = new Scanner(System.in);
        // Calculating Maximum two numbers in Java System.out.println("Please enter two numbers to find maximum of two");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();





    // Function to return maximum
    // among the two numbers
    static int maximum(int a, int b,int c)
    {
        return a+b*c;
    }

    // Function to return minimum
    // among the two numbers
    static int minimum(int a, int b,int c)
    {
        return c+a/b;
    }

    // Driver code
    public static void main (String[] args)
    {
        int a = 99, b = 18,c =20;

        // Displaying the maximum value
        System.out.println("Maximum: " + maximum(a, b,c));

        // Displaying the minimum value
        System.out.println("Minimum: " + minimum(a, b,c));
    }
}



