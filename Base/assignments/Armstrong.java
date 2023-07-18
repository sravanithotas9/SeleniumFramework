package com.assignm;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        /*1. Take integer variable Arms.
          2. Assign a value to the variable.
          3. Split all digits of Arms.
          4. Find cube-value of each digit.
          5. Add all cube-values together.
          6. Save the output to Sum variable.
          7. If Sum equals to Arms print Armstrong Number.
          8. If Sum does not equal to Arms print Not Armstrong Number.*/


        Scanner in = new Scanner ( System.in );

        System.out.println ( "enter n number" );

        int n = in.nextInt ();

        int n2,rem,res = 0;

        n2 = n;

        while (n2!= 0) {
            rem = n2 % 10;

            res = res + (rem * rem * rem);  /*  or we can write rem cube as Math.pow(rem, 3) */

            n2= n2/10;
        }

        if (res == n)
            System.out.println ( n + " is an Armstrong number." );
        else
            System.out.println ( n + " is not an Armstrong number." );
    }
}





