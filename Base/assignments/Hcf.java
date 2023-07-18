package com.assignm;

import java.util.Scanner;


    public class Hcf {
        //highest common factor 24,36---> divsors are 2,3,6,12 here hcf=12
        /* 2,6,8 ---> hcf= 2 here 3 should be multiplle with a single number
        and we should not concentrate on remainder 1 in hcf
         */

        public static void main(String[] args) {

            Scanner in = new Scanner ( System.in );



            System.out.println ( "Enter two numbers" );

            int a = in.nextInt ();

            int b = in.nextInt ();

            HCF(a,b);
        }

          static void HCF(int a,int b){

            int hcf;

            if(a<b) {
                hcf = a;
            }else
                hcf = b;


            while(true) {

                if((a%hcf == 0) && (b%hcf == 0))
                    break;

                else
                    hcf--;

            }
            System.out.println( "\n HCF ("+a+  ", "+ b+ ") = "+ hcf);

        }
    }

