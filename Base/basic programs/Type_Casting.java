package com.sravani;

import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);

        float num= input.nextFloat();
        System.out.println(num);


        *//*type casting*//*

        int num= (int) (56.678);
        System.out.println(num);




        *//*automatic type promotion expression*//*

        int a = 258;
        byte b =(byte) (a);
        System.out.println(b);
         *//*   258 % 256 = 2,because byte contain 256 keys  *//*

         byte a =23;
         byte b =45;
         byte c =7;
         int d = a*b/c;
         System.out.println(d);




        int number ='a';
        System.out.println(number);



        System.out.println( 7 * 5.6F);*//*float *integer = float*//*


        byte a = 76;
        float f = 3.90f;
        char c = 'a';
        double d =0.789d;
        int i = 1234;
        short s = 6789;
        double result = (f*a) + (i/c) - (d*s);
        System.out.println((f*a) + " "+ (i/c) + " " + (d*s) + " ");
        System.out.println(result);
*/

    }
}
