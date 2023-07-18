package com.assignm;

import java.util.Scanner;

public class Sum_of_digit_numbers {
    public static void main(String[] args) {
        Sum_of_digit_numbers sum_of_digit_numbers = new Sum_of_digit_numbers ();
        int resultSum = sum_of_digit_numbers.testSumOfIntegers();
        System.out.println (resultSum);
    }
    public int testSumOfIntegers() {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ();
        int sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
}

/*674 % 10 = 4

Sum = 0 + 4 = 4

674 / 10 = 67*/
