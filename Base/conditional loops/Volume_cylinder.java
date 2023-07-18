package Loops;

import java.util.Scanner;

public class Volume_cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the height value");
        int h =sc.nextInt ();
        System.out.println ("enter the radius value");
        int r=sc.nextInt ();
        double pi=3.14;
        double V=pi*h*r*r;
        System.out.println ("volume of cylinder " + V);
    }

}
