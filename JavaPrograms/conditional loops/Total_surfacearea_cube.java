package Loops;

import java.util.Scanner;

public class Total_surfacearea_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the side a value");
        int a= sc.nextInt ();
        double V=6*a*a;
        System.out.println ("total sure area of cube " + V);
    }
}
