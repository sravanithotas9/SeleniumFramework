package Loops;

import java.util.Scanner;

public class Perimeter_square {
    public static void main(String[] args) {

        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the perimeter of square side");
        int a=sc.nextInt ();
        double p=4*a;
        System.out.println ("perimeter of square "+ p);

    }
}
