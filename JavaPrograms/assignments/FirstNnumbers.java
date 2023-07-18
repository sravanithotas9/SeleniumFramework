package com.assignm;

import java.util.Scanner;

public class FirstNnumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner ( System.in );
        int X= natural (3);
        System.out.println (X);
    }
    static int natural(int num){

       int  sum=0;

        for(int i=0;i<= num;i++){

          sum=sum+i;
        }
        return sum;
    }
}
