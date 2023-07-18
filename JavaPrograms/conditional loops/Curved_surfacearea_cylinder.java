package Loops;

import java.util.Scanner;

public class Curved_surfacearea_cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the radius");
        int r=sc.nextInt ();
        System.out.println ("enter the height");
        int h=sc.nextInt ();
        double pi=3.14;
        double V=pi*r*r*h;
        System.out.println ("volume of surface area cylinder "+ V);
    }
}
