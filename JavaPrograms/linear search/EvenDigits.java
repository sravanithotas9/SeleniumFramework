package com.linear.search;

public class EvenDigits {
    //leetcode problem findnumber of even digits return the number of even numbers value
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};

       System.out.println (findNumbers (nums));
        /*to find digit example from this program*/
      // System.out.println (Digits(45678));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for (int num:nums) {
            if(even(num)){ //even is the method it is written down
                count++;
            }
        }
        return count;
    }
    //method to check whether a number contains even digit or not
    static boolean even(int num){
        int numberofdigits = Digits(num);
        if(numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }
    //count number of digits in a number
    public static int Digits(int num){

        int count=0;
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        while(num >0){
            count++;

            num=num/10;
        }
        return count;
    }
}
