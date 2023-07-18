package com.assignm;

import java.util.Scanner;

public class Maximum_minimum {
    public static void main(String[] args) {

            Scanner in = new Scanner ( System.in );
            int a = in.nextInt ();
            int b = in.nextInt ();
            int c = in.nextInt ();
            int maximum = max( a, b, c );
            int minimum = min( a, b, c );
            System.out.println ( maximum );
            System.out.print ( minimum );

        }

        static int max(int a, int b, int c ){
            int max_val= a;
            if (b > max_val) {
                max_val = b;
            }
            if (c > max_val) {
                max_val = c;
            }
            return max_val;

        }
        static int min ( int a, int b, int c){

            int min_val = a;
            if (b < min_val) {
                min_val = b;
            }
            if (c < min_val) {
                min_val = c;
            }
            return min_val;

        }
    }
