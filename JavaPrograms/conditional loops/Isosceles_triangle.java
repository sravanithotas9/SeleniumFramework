package Loops;

import java.util.Scanner;

public class Isosceles_triangle {
    public static void main(String[] args) {
        int b,h;
        Scanner sc=new Scanner ( System.in );

        System.out.println ("enter the base");
        b= sc.nextInt ();
        System.out.println ("enter the height");
        h=sc.nextInt ();
        double area =(b*h)/2;
        System.out.println ("enter the isosceles triangle "+ area);
    }
}
