package Loops;

import java.util.Scanner;

public class Volume_sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the radius value");
        int r=sc.nextInt ();
        double pi=3.14;
        double V=1.33*pi*r*r*r;
        System.out.println ("volume of sphere "+ V);
    }
}
