package com.ayan;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  sNeg = 0, sEven = 0, sOdd = 0;
        System.out.println("enter the numbers");
        while(true){
            int n = in.nextInt();

            if(n==0){
                break;
            } else if (n<0) {
                sNeg = sNeg + n;
            } else if (n%2 == 0) {
                sEven = sEven + n;
            }else {
                sOdd = sOdd + n;
            }
        }
        System.out.println("Sum of negative: " +sNeg);
        System.out.println("Sum of Positive Even: " +sEven);
        System.out.println("Sum of Positive Odd: " +sOdd);
    }
}
