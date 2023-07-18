package com.assignm;

import java.util.Scanner;

public class Rupees_USD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float RUP = sc.nextInt ();/*we can take int or float*/
        float USD = RUP * 76;
        System.out.println(USD);
    }
}
