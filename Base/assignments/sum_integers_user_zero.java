package com.assignm;

import java.util.Scanner;

public class sum_integers_user_zero {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        int n = 1;
        int sum=0;
        while(n!=0){
            n=sc.nextInt ();
            sum += n;
        }
        System.out.println (sum);
    }
}
