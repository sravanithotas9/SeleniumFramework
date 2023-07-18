package Loops;

import java.util.Scanner;

public class Perimeter_rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the rhombus side");
        int a=sc.nextInt ();
        double p=4*a;
        System.out.println ("perimeter of rhombus " + p);
    }
}
