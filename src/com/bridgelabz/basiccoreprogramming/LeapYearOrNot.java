package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class LeapYearOrNot {
    static void checkLeapYear(){
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
          System.out.println("Not A Leap Year");
    }

    public static void main(String[] args) {
        System.out.println("Enter Year For Checking Given Year is Leap Year Or NOT Leap Year");
        checkLeapYear();

    }
}
