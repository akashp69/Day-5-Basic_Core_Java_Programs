package com.bridgelabz.basiccoreprogramming;


import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the number you need to swap: a;b");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double t;
        System.out.println("numbers before swapping a = "+a + "b = "+b);
        t=a;
        a=b;
        b=a;
        System.out.println("after swapping the numbers are a= "+b +"b= "+t);
    }
}


