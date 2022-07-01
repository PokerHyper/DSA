package com.ayan;

import static java.util.Collections.swap;

public class StringFunc {
    public static void main(String[] args) {
//        String name = "Ayan Dey";
//        name = greet(name);
//        System.out.println(greet(name));
//        System.out.println(name);

        int a = 20;
        int b = 30;

        swapa(a, b);
        System.out.println(a + " " +b);
    }

    static void swapa(int number1, int number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println(number1 + " " + number2);
    }


//    static String greet(String naam){
//        naam = "Kunal";
//        return naam;
//    }
}

