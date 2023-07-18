package com.assignm;

import java.util.Scanner;

public class Printsumofall {
    public static void main(String[] args) {


        //take input from the user till user does not press x

        Scanner in = new Scanner(System.in);


         int sum =0;

        while (true) {

            System.out.println("enter number");
            String a = in.nextLine();

            if (a.equalsIgnoreCase("x")){
                System.out.println("sum :" +sum);


                break;

            }
            sum = sum+Integer.parseInt(a);


        }
    }
}


