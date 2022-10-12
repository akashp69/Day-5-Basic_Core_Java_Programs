package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class EvenOrOdd {
    static void checkEvenOrOdd (){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");


    }
    public static void main(String[] args) {
        System.out.println("Enter a Number For Checking Number is Even Or Odd");
        checkEvenOrOdd();

    }
}
