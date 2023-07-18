package com.assignm;

import java.util.Scanner;

public class Power_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "enter the value a" );
        int a = sc.nextInt ();
        System.out.println ( "enter the value b" );
        int b = sc.nextInt ();
        power(a,b);

    }
    static void power(int a,int b){
        double pow=Math.pow ( a,b );
        System.out.println ("math.power of a,b is:" + pow);

    }
}
