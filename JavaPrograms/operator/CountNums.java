package com.sravani1;

public class CountNums {

    public static void main(String[] args) {

/*n=46558, answer is 2....here we have to find out no. of 5's....
* n = n/10-->n=46558/10....10)46558(4655
*                            -4655
*                             _______
*                                 8
*   n % 10 = last digit,remainder of the 10 will give the last digit*/
        int n=465589;

        int count = 0;

        while (n > 0) {

            int rem = n % 10;

            if (rem == 5){

                count++;

            }
            n = n / 10; // n /=10
        }

            System.out.println(count);



    }
}
