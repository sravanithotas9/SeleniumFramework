package com.linear.search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array={ {34,67,89},
                {67,90,878,35,1},
                {32,33,56,71,6},
                {3,5,8,0,2}
        };
        int target=6;
        int[] ans=search2D(array,target);
        System.out.println ( Arrays.toString (ans));


    }
    static int[] search2D(int[][] array, int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length ; col++) {
                if(array[row][col]==target){
                  return new int[]{row, col};
                }


            }

        }
        return new int[] {-1,-1};
    }
}
