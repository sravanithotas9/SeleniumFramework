package Loops;

import java.util.Scanner;

public class Fibbonicci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
       int count=sc.nextInt ();
       int n1=0;
       int n2=1;
       int n3;
        for (int i = 2; i <count ; i++) {
            System.out.println ( n1 + " ");
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }

    }
}
