package Loops;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );

        int i = 5;
        int largest = 0;
        while (i != 0) {
            if (i > largest) {
                largest = i;
                System.out.println (largest);
            }

        }

    }
}
