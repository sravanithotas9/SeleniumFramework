package com.assignm;

import java.util.Scanner;

public class HCF_LCM {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        /*here a=24,b=32 then num1 = 24,num2=32 ---> b!=0 (true),---> x=b--> x=32,b=a%b --->b=24/32--->a=x;
        a=b means b=8 when we do % of a and b as b send it x,so now a=x means a=8 then HCF=a--->HCF=8.
        LCM=(num1*num2)/HCF means LCM= (24*32)/HCF--->LCM=768/8--->LCM=96*/

        int x,HCF,LCM;

        int a = in.nextInt();

        int b =in.nextInt();

        int num1 =a;
        int num2 =b;

        while(b!=0) {

            x = b;

            b = a % b;

            a = x;

        }
        HCF= a;
        LCM = (num1*num2)/HCF;

        System.out.println("\n HCF (" + num1 + "," + num2 +"), = " + HCF );
        System.out.println(" LCM (" + num1 +"," + num2 + "),= " + LCM);



        }

    }

