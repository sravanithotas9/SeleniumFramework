package com.srithi;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Sum {
    public static void main(String[] args) {
    /*    int ans = sum2 ();
        System.out.println (ans);*/

        int ans = sum3 ( 27, 78 );
        System.out.println ( ans );
    }
    /*return_type name (arguments) {
     * body
     * return statement;
     * }*/
    /*static void sum() {
        Scanner in = new Scanner ( System.in );
        System.out.println ("Enter number num1");
        int num1=in.nextInt ();

        System.out.println ("enter number n2");
        int num2 =in.nextInt ();
        int sum=num1+num2;
        System.out.println ("sum "+   sum);*/



    /*to return the value instead of void we cna return int/float/double we have to write static int to return sum*/

/*
        static int sum2() {
            Scanner in = new Scanner ( System.in );
            System.out.print ("Enter number num1");
            int num1=in.nextInt ();

            System.out.print ("enter number n2");
            int num2 =in.nextInt ();
            int sum=num1+num2;
            return sum;
*/



    /*pass the value of numbers when you are calling the method in main()*/

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;

    }


}






