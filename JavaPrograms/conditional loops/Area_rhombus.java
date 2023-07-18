package Loops;

import java.util.Scanner;

public class Area_rhombus {
    public static void main(String[] args) {
        int p,q;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the p diagonal");
        p= sc.nextInt ();
        System.out.println ("enter the q diagonal");
        q= sc.nextInt ();
        double  area = (p*q)/2;
        System.out.println ("enter the area of rhombus " + area);
    }
}
