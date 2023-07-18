package Com.java;

import java.util.Arrays;

public class MissingNum_Cyclicsort {
    //Leet-code 268.Missing Number (Easy) problem
    //asked in Amazon interview
    //missing number in the distinct numbers in the range (0,N) it means we have to go for CYCLIC SORT
    public static void main(String[] args) {
        int[] arr={4,2,0,1};
        System.out.println (MissingNumber(arr));
    }
    static int MissingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap ( arr, i, correct );
            } else {
                i++;
            }
        }
        //searching for missing  number

        for (int index = 0; index < arr.length; index++) {
            //here index+1 is written for[1,n] else index is written for[0,n]
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

