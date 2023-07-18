package com.sravani1;

import java.util.Scanner;

public class Fibbonciss {

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

  /*
  /*      a,b--->a=0,b=1 ,previous input  of b goes to a as a input && current output of a+b = goes to b input */
  /*      * then b comes to a & a=0,b=a+1 --> b=1, current input is a + b =1+1 =2 that goes to b next input*/
  /*      * then b comes to a &a=1,b=a+1 ---> b=2, current input is a + b =1+2 =3 that goes to b next input  */
  /*      * then b comes to a & a=2,b=a+3 ---> b=3,current input is a + b = 2+3 =5 that goes to b next input
  */   /*   * then b comes to a & a= 3,b=a+5 ---> b=5,current input is a + b = 3+5 =8 that goes to b next input               */


        int n = in.nextInt();

        int a = 0;

       int b = 1;

        int count = 2;

        while (count <= n) {

           int temp = b;

            b = b+a;

           a = temp;

            count++;

        }
       System.out.println(b);
    }
}
