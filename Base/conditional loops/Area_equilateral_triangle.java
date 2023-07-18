package Loops;

import java.util.Scanner;

public class Area_equilateral_triangle {
    public static void main(String[] args) {
        int a;
        double sqrt3 =1.732;

        Scanner sc= new Scanner ( System.in );

        System.out.println ("enter sides of triangle");

        a= sc.nextInt ();
        double area= (sqrt3/4)*a*a;
        System.out.println ("area of equilateral triangle" + area);
    }
}
