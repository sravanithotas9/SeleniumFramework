package Loops;

import java.util.Scanner;

public class Volume_pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        System.out.println ("enter the b value");
        int b=sc.nextInt ();
        System.out.println ("enter the h value");
        int h=sc.nextInt ();
        double B = 0.5*b*h;
        System.out.println ("value of area of the base " + B);
        System.out.println ("enter the height value");
         int H= sc.nextInt ();
         double V=0.33*B*H;
        System.out.println ("volume of pyramid " + V);

    }
}
