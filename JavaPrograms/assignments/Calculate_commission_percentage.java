package com.assignm;

import java.util.Scanner;

public class Calculate_commission_percentage {
    public static void main(String[] args) {
        int commission=0;
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "enter the price of property" );
        int price = sc.nextInt ();
        if (price < 5000 ) {
            commission = (price * 5) / 100;
        }
        else if (price >5000 && price<=10000) {
            commission = (price * 10)/100;
        }
        System.out.println ("commoision percentage:"  + commission );


        }
    }

