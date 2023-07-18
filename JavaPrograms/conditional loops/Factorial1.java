package Loops;


import java.util.Scanner;

public class Factorial1 {
    public static void main(String args[]) {
        Scanner sc= new Scanner ( System.in );
        int fact = 1;
        int num=sc.nextInt ();  //It is the number to calculate factorial.
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println ( "Factorial of " + num + " is: " + fact );

    }
}
