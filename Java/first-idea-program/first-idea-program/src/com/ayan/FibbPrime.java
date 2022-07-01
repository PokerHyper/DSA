package com.ayan;

import java.util.Scanner;

public class FibbPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the limit of the fibb series:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int sumPrime = 0;
        int flag;

        while(count <= n){  //calculating the fibb series
            flag = 0;
            int temp = b;
            b = b+ a;
            a = temp;
            count++;
                for (int i = 2; i <= b/2; i++){  //checks for prime
                    if(b % i == 0 ){
                         flag++;
                    }
                }
                if(flag == 0){  //if prime flag is zero
                    sumPrime = sumPrime + b;
                }


        }
        System.out.println("Sum of prime no in the fibb series:" +--sumPrime);
    }
}
