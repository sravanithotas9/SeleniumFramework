package Loops;

import java.util.Scanner;

public class Perimeter_circle {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner sc= new Scanner ( System.in );

        System.out.println ("enter radius of perimeter circle");

        r= sc.nextInt ();
        double area=2*pi*r;
        System.out.println ("area of perimeter circle" + area);
    }
}
