package com.ayan;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int rev = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse:");
        int num = in.nextInt();
        while(num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        System.out.println("Reverse no is: "+rev);
    }
}
