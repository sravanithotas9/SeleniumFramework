package Loops;

import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {
        int h,b;
        Scanner sc= new Scanner ( System.in );

        System.out.println ("enter height of triangle");

        h= sc.nextInt ();
        System.out.println ("enter base of triangle");
        b= sc.nextInt ();

        double area=(b*h)/2;

        System.out.println ("area of triangle" + area);

    }
    }

