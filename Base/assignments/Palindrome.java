package com.assignm;


import java.util.Scanner;

public class Palindrome {


    public static void main(String args[]) {
/*        String str, reverse = "";

        Scanner in= new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome");

        str = in.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )

            reverse = reverse + str.charAt(i);*//*charAt(i) index of the given input*//**//*/

        if (str.equals(reverse))

            System.out.println("string is a palindrome.");
        else
            System.out.println("string is not a palindrome.");
    }
}*/
      int num = 121;

      palin(num);


    }
    static void palin(int num){
      int rev= 0, rem;
      int a = num;


    while (num != 0) {
      rem = num % 10;
      rev = rev * 10 + rem;
      num = num/10;
    }


    if (a == rev) {
      System.out.println(a + " is Palindrome.");
    }
    else {
      System.out.println(a + " is not Palindrome.");
    }
  }
}
