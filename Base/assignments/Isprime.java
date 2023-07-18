package com.assignm;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int a = 5;
        int b = 12;
        prime ( a, b );

    }

    static void prime(int a, int b) {

        for (int i = a; i <= b; i++) {

           boolean isPrime =  Prime.primes ( i );

           if(isPrime){

               System.out.println (i);
           }

        }


}






























}
