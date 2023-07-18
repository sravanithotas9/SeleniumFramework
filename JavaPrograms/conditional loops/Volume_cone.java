package Loops;

import java.util.Scanner;

public class Volume_cone {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in );
        System.out.println ("enter the radius");
        int r=sc.nextInt ();
        System.out.println ("enter the height");
        int h=sc.nextInt ();
        double pi =3.14;
        double v= pi*r*r*(h*0.333);
        System.out.println ("volume of the cone " + v);
    }
}
