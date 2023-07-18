package com.assignm;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        /*lcm is a least common multiplier if we take 12,36,72,144-->36 is divisible by 12 ignore 12
        & 72 divisible by 36 ignore 36  & 144 divisible by 72 ignore 72& answer is 144
        in other condition 12,24,48 here 24 is not a divisor of 12 but 48 is divisible by 12
        then ignore 12 and do lcm of 24,48 untill the remainder gets 1 then multiple all the divisors lcm of 24,48=144 */

        Scanner in =new Scanner(System.in);

        int a,b, c,lcm;

         a = in.nextInt();

         b= in.nextInt();

         c = in.nextInt();

        System.out.println("Enter three numbers");

        if(a>b) {
            lcm = a;
        }else if (b>c) {
            lcm = b;
        }else  {
            lcm = c;

            while(true){

                if((lcm % a == 0) && (lcm % b == 0)&& (lcm % c == 0)){
                    break;

                }else
                    lcm++;

            }
            System.out.println( "\n LCM ("+a+  ", "+ b+ ", "+c +") = "+ lcm);

        }

    }
}
