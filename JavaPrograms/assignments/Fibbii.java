package com.assignm;

import java.util.Scanner;

public class Fibbii {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        /*   a,b--->a=0,b=1 ,previous input  of b goes to a as a input && current output of a+b = goes to b input */
        /*      * then b comes to a & a=0,b=a+1 --> b=1, current input is a + b =0+1 =1 that goes to b next input*/
        /*      * then b comes to a &a=1,b=a+1 ---> b=2, current input is a + b =1+2 =3 that goes to b next input */
        /*      * then b comes to a & a=2,b=a+2 ---> b=3,current input is a + b = 2+3 =5 that goes to b next input
        /*   * then b comes to a & a= 3,b=a+5 ---> b=5,current input is a + b = 3+5 =8 that goes to b next input  */



       int count = in.nextInt();
       int num1=0;
       int num2=1;
       int num3;


       for(int i=2;i<=count;i++) {

           System.out.print(num1+ " ");

           num3 = num1+num2;

           num1=num2;

           num2=num3;

       }

    }
}
//n1=0;
// n2= n1+1;
// n3=n1+n2;
// n3=0+1;
// n3=1;


//n2--->n1=n2;
//n2=n1+n2;
//n2=n3;