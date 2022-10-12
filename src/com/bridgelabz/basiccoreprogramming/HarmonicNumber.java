package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class HarmonicNumber {  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N;
    double result=0.0;
    System.out.println("Enter the Nth Harmonic Number");
    N = s.nextInt();
    while (N>0) {
        result =result+ (double)1/N;
        N--;
    }
    System.out.println("Nth harmonic output is= "+result);
}
}
