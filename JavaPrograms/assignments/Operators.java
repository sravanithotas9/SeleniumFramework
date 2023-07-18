package com.assignm;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;



            System.out.println("enter the operator");

            char op = in.next().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '*') {

                System.out.println("enter two numbers");

                int a = in.nextInt();

                int b = in.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
                if (op == '-') {
                    ans = a - b;
                }


                System.out.println(ans);




        }
    }
}

