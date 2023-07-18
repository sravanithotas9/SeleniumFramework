package com.assignm;

import java.util.Scanner;

public class Calculate_dist_btwn_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ("enter the value of x2");
        int x2= sc.nextInt ();
        int x1=1;
        System.out.println ("enter the value of y2");
        int y2 =sc.nextInt ();
        int y1=1;
        double distance=Math.sqrt ( ((x2-x1) *(x2-x1)) + ((y2-y1))*(y2-y1) );
        System.out.println ("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") " +distance);




    }
}
