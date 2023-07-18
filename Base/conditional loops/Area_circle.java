package Loops;

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
              int r;
              double pi = 3.14;
        Scanner sc= new Scanner ( System.in );

        System.out.println ("enter radius of circle");

        r= sc.nextInt ();
        double area=pi*r*r;
        System.out.println ("area of circle" + area);

    }
}
