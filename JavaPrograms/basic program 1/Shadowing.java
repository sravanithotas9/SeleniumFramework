package com.srithi;

public class Shadowing {
    static int x = 30;/*this will be shadow at line 8*/

    public static void main(String[] args) {
        System.out.println ( x );//30
        int x;//the class variable at line 4 is shadowing by this
        // System.out.println (x); //scope will begin the value is intialised//
        x = 20;
        System.out.println ( x );//20
        fun ();

    }

    static void fun() {
        System.out.println ( x );//x value is take from the line 4 because above method is closed that x is closed there
    }
}
