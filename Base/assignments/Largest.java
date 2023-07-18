package com.assignm;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        int a = in.nextInt ();
        int b = in.nextInt ();
         larg ( a, b );
    }

      static void larg(int a, int b) {

          if (a > b) {
              System.out.println ( "a is largest" );

          } else
              System.out.println ( "b is largest" );

      }
    }

