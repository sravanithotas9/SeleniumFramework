package com.assignm;

import java.util.Scanner;

public class Java_perfect_number {
    public static void main(String[] args) {
        /*Perfect Number in Java

Any number can be a Java Perfect Number if the sum of its
positive divisors excluding the number itself is equal to that number.
For example, 28 is a perfect number because 28 is divisible by 1, 2, 4, 7, 14 and 28 and
the sum of these values is 1 + 2 + 4 + 7 + 14 = 28. Remember, we have to exclude the number itself.
That is why we have not added 28 here. Some of the Java perfect numbers are 6, 28, 496, 8128, and 33550336, so on.*/

        Scanner sc = new Scanner ( System.in );
        int sum = 0;
        System.out.println ( "enter the number" );
        int n = sc.nextInt ();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

            if (sum == n) {
                System.out.println ( "print perfect number" );

            } else {
                System.out.println ( "not a perfect number" );
            }

        }
    }


