package com.assignm;

import java.util.Scanner;

public class Calcuate_depression_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "enter the amount" );
        int amount = sc.nextInt ();
        System.out.println ( "enter the depreciation value" );
        int depreciation_value = sc.nextInt ();
        System.out.println ( "enter the years" );
        int year = sc.nextInt ();
        int temp = depreciation_value;
        for (int i = 0; i < year; i++) {
            temp = ((100 - depreciation_value) * temp) / 100;
            System.out.println ( "after depreciation :" + temp );

        }
    }
}
