package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class VowelsOrNot {
    static void checkVowel(){
        char alphabet;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
        System.out.println("Vowel");
        else
        System.out.println("NOT Vowel");
    }
    public static void main(String[] args) {

        System.out.println("Check Letter is Vowel Or NOT");
        checkVowel();
    }
}
