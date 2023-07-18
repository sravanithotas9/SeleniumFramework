package com.assignm;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {


        boolean X =primes(12);

        System.out.println (X);


    }

    static boolean primes(int num){

        for (int i = 2; i <num ; i++) {

            if(num%i==0){

                return false;
            }


        }
        return true;
    }
}
