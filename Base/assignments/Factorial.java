package com.assignm;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int num = sc.nextInt ();
        fact(num);
    }

    static void fact(int num){
        int fac =1;

        for (int i = 1; i <= num ; i++){



             fac=fac * i;

            System.out.println ( "Factorial of " + num + " is: " + fac);



        }
    }
}
