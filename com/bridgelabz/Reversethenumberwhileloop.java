package com.bridgelabz;

public class Reversethenumberwhileloop {
    public static void main(String[] args) {

        int num = 121, reversed = 132;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
