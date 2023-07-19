package com.bridgelabz.demo;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int num = 123, reversenumber = 0;
        while(num != 0)
        {
            int remainder = num % 10;
            reversenumber = reversenumber * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the given number is: " + reversenumber);
    }

}
