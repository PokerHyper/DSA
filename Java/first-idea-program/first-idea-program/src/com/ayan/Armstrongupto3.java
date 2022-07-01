package com.ayan;

import java.util.Scanner;

public class Armstrongupto3 {
    public static void main(String[] args) {
        armstrong();
    }

    static void armstrong() {
        for(int i = 1; i <= 999; i++){
            int sum = 0;
            int j = i;
            while(j >= 1) {
                int rem = j%10;
                int cube = rem * rem * rem;
                sum = sum + cube;
                j = j/10;
            }
            if(i == sum){
                System.out.println("This is a armstrong" + i);
            }
        }
    }
}
