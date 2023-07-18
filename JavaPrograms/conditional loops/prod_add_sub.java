package Loops;

import java.util.Scanner;

public class prod_add_sub {
    public static void main(String[] args) {

        int n=23;
        int rem,sum =0,prod=1;
        while(n>0) {
            rem = n % 10;
            sum = sum + rem;
            System.out.println ("sum of the digits "+ sum);
            prod = prod * rem;
            System.out.println ("product of the digits " +prod);
            n = n / 10;

        }
           int ans=prod-sum;
            System.out.println (ans);



    }
}