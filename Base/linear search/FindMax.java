package com.linear.search;

import static java.lang.Long.MIN_VALUE;

public class FindMax {
    public static void main(String[] args) {
        int[] arr={45,3,24,-4,-98,89,76};
        System.out.println (max(arr));

    }
   static int max(int[] arr){
        int ans=arr[0];
       for (int i=0;i<=arr.length;i++) {
           if (i > ans) {
               ans = i;
           }

       }
        return ans;

        }
        }