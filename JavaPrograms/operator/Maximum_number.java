package com.sravani1;

import java.util.Scanner;

public class Maximum_number {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest values of the three
       /*  int max = a;

         if(b>max){

             max=b;

             if(c>max){

                 max=c;

                 System.out.println(max);
             }
         }*/

       /* int max= 0;

         if(a>b) {
             max= a;
         } else {
             max = b;
         }

         if (c > max) {
             max=c;

             System.out.println(max);
         }*/



         int max = Math.max(c,Math.max(a,b));

         System.out.println(max);
    }
}
