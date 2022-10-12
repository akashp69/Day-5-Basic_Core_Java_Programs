package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE POWER OF 2 USE CASE");
        Scanner s = new Scanner(System.in);
        int n;
        int i=1;
        int power = 1;
        System.out.println("Enter the power until which you want to calculate");
        n = s.nextInt();
        while(i<=n) {
            power=power * 2;
            System.out.println("values of powers = "+power);
            i++;
        }
    }
}

