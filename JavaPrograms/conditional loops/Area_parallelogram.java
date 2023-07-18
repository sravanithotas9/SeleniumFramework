package Loops;

import java.util.Scanner;

public class Area_parallelogram {
    public static void main(String[] args) {
         int b,h;
        Scanner sc= new Scanner ( System.in );
        System.out.println ("enter the base");
        b= sc.nextInt ();
        System.out.println ("enter the height");
        h=sc.nextInt ();
        double area=b*h;
        System.out.println ("area  of parallelogram "+ area);

    }
}
