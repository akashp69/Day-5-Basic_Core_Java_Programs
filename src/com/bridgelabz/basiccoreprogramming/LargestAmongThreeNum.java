package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class LargestAmongThreeNum {
    public static void main(String[] args) {

        System.out.println("Checking Largest Number Between Three Numbers Enter Any Three Number ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The Largest Number Among Three is " + a);
        }
        else if (b>a && b>c) {
            System.out.println("The Largest Number Among Three is " + b);
        }
        else{
            System.out.println("The Largest Number Among Three is "+ c);
        }

    }
}
