package com.sravani;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("please enter temp in C :");
        float tempc = in.nextFloat();
        float tempF = (tempc * 9/5) +32;
        System.out.println(tempF);
    }
}
