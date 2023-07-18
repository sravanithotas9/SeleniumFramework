package com.assignm;

import java.util.Scanner;

public class Multi_Table {

    public static void main(String[] args) {

        Scanner in = new Scanner ( System.in );

        int n = in.nextInt ();
        
        multi(n);


    }
      static void multi(int n){

        for(int i=1;i<=10;i++){

            System.out.println(n + "*" + i + "="  + n*i);
        }
    }
}
