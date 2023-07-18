package Loops;

import java.util.Scanner;

public class Area_rectangle {
    public static void main(String[] args) {
        int L,W;
        Scanner sc=new Scanner ( System.in );
        System.out.println ("enter the rectangle length");
       L= sc.nextInt ();
        System.out.println ("enter the rectangle width");
        W= sc.nextInt ();
        double  area = L*W;
        System.out.println ("enter the area of rectangle " + area);
    }
}
