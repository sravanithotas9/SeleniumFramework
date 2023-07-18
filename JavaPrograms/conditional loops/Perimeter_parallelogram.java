package Loops;

import java.util.Scanner;

public class Perimeter_parallelogram {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner ( System.in );
        System.out.println ("enter the side");
        a= sc.nextInt ();
        System.out.println ("enter the base");
        b=sc.nextInt ();
        double p=2*(a+b);
        System.out.println ("perimeter  of parallelogram "+ p);
    }
}
