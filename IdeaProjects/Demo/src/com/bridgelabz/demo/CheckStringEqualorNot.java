package com.bridgelabz.demo;

import java.util.Scanner;

public class CheckStringEqualorNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //  String s1 = sc.nextLine();
        System.out.println("enter the first value");

       // String s2 = sc.nextLine();
        System.out.println("enter the second value");
       String s1= "Dev";
        String s2 = "Dev";

        if(s1.equals(s2))
        {
            System.out.println("String are equals");
        }
        else
            System.out.println("String are not equals");

    }
}