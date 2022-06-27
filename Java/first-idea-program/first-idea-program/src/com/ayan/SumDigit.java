package com.ayan;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
         while(num != 0){
             sum = sum + (num%10);
             num = num/10;
         }
        System.out.println("The sum of digits i: " +sum);
    }
}
