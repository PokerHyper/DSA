package com.ayan;

import java.util.Scanner;

public class NoCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = in.nextInt();
        System.out.println("Enter the digit which u want to count");
        int digit = in.nextInt();
        int count = 0, rem;
        while(num > 0){
            rem = num % 10;
            if(rem == digit){
                count++;
            }
            num = num /10;
        }
        if(count == 0){
            System.out.println("Number Not Found");
        }else{
            System.out.println("Number count of "+digit +" is "+count +" times");
        }
    }
}
