package com.assignm;

import java.util.Scanner;

public class Calculate_discount {
    public static void main(String[] args) {

        int costToPaid, discount;

        Scanner sc = new Scanner ( System.in );

        System.out.print ( "Enter the Total Amount of Shopping: " );

        int price = sc.nextInt ();

        if (price <= 800) {
            costToPaid = price;
        } else if (price > 800 && price <= 1500) {
            discount = (price * 10) / 100;
            costToPaid = price - discount;
        } else if (price > 1500 && price <= 2500) {
            discount = (price * 15) / 100;
            costToPaid = price - discount;
        } else if (price > 2500 && price <= 5000) {
            discount = (price * 20) / 100;
            costToPaid = price - discount;
        } else {
            discount = (price * 30) / 100;
            costToPaid = price - discount;
        }
        System.out.println ( "The cost to be Paid is: " + costToPaid );
    }
}








