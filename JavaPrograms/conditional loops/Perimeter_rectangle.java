package Loops;

import java.util.Scanner;

public class Perimeter_rectangle {
    public static void main(String[] args) {
        int l,w;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the length of triangle");
        l=sc.nextInt ();
        System.out.println ("enter the width of triangle");
        w=sc.nextInt ();
        double p =2*(l+w);
        System.out.println ("perimeter of rectangle " + p);
    }
}
