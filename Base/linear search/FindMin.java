package com.linear.search;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={12,34,56,78,9,23,-1,-56};
        System.out.println (minimum(arr));
    }
    static int minimum(int[] arr){
        int ans=arr[0]; // int max= Integer MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {   /*for(int[] ints:arr) {
                                                    for(int elements : ints){*/
            if(arr[i]<ans){
                ans=arr[i];


            }

        }
        return ans;
    }
}
