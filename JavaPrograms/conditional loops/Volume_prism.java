package Loops;

import java.util.Scanner;

public class Volume_prism {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );

        System.out.println ("enter the length");
        int l=sc.nextInt ();
        System.out.println ("enter the width");
        int w=sc.nextInt ();
        System.out.println ("base value");

        int B=l*w;

        System.out.println ("enter height value");
        int H=sc.nextInt ();
        double V=B*H;
        System.out.println ("volume of prism " + V);
    }
}
