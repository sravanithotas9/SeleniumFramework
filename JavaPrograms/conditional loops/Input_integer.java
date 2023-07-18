package Loops;

import java.security.cert.X509Certificate;
import java.util.Scanner;

public class Input_integer {
    public static void main(String args[]) {
        Scanner sc = new Scanner ( System.in );

        int sum = 0; int i=5;
        while(i!=0){
            i=sc.nextInt ();
            sum=sum+i;


        }
/*
        for (int i = 1; i < number; i++) {
            sum = sum + i;*/

        System.out.println ("sum is:" + sum  );

    }

    }

