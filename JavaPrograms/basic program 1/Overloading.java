package com.srithi;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
     /*   fun(56);

        fun("sravani");*/

        int ans = sum ( 30, 67, 89 );
        System.out.println ( ans );


        //overloading is of giving same method name here like fun & sum and passing different arguments

    }

    static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }

    static int sum(int a, int b, int c) {
        int ans = a + b + c;
        return ans;
    }


    static void fun(int a) {
        System.out.println ( a );
    }

    static void fun(String name) {
        System.out.println ( name );
    }
}