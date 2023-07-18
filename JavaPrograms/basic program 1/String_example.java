package com.srithi;

import java.util.Scanner;

public class String_example {
    public static void main(String[] args) {
    /*    String message = greet();
        System.out.println (message);*/
        Scanner in = new Scanner ( System.in );
        System.out.print ( "enter your name" );
        String name = in.next ();
        String personalised = mygreet ( name );
        System.out.println ( personalised );
    }

    static String mygreet(String name) {
        String message = "hello " + name;
        return message;

    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}
