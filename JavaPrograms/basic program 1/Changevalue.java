package com.srithi;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        /*create an array*/
        int[] arr = {10, 5, 7, 9};
        change ( arr );
        System.out.println ( Arrays.toString ( arr ) );
    }

    static void change(int[] nums) {
        nums[3] = 8;//if you change to the object via this reference variable,same object will be changed.
    }
}
