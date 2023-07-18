package com.linear.search;

import java.util.Arrays;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] array={ {34,67,89},
                {67,90,878,35,1},
                {32,33,56,71,6},
                {3,5,8,0,2}
        };

        System.out.println ( maximum1(array));

    }
    static int maximum1(int[][] array){
        int maximum= Integer.MIN_VALUE;
        for (int row=0;row<=array.length;row++) {
            for (int col=0;col<=array[row].length;col++) {
                if (array[row][col] > maximum) {
                    maximum = array[row][col];
                }

            }

        }
        return maximum;
    }
}
