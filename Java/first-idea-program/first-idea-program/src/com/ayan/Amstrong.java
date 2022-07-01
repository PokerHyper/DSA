package com.ayan;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no you want to check for armstrong");
        int n = in.nextInt();
        boolean ans = armstrong(n);
        System.out.println(ans);
    }

    static boolean armstrong(int n) {
        int sum = 0;
        int num = n;
        if(n == 0){
            return true;
        }
        while(n >= 1) {
            int rem = n%10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n/10;
        }
        return sum == num;
    }
}
