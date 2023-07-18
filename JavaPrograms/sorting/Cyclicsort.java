package Com.java;

import java.util.Arrays;

public class Cyclicsort {
    //hint of cyclic sort array is distinct numbers int the range(0,N) /(1,N)
    // time complexity is 0(n) .....,space complexity is0(1)
    //in question where ever you find no range (0,N) solve with cyclic sort

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1, 7, 6, 8};
        cyclic ( arr );
        System.out.println ( Arrays.toString ( arr ) );

    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            //here array[i]-1 is written for[1,n] else array[i]is written for[0,n]

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {

                // or we can write swap function here
                // swap ( arr, i,correct ); we should write swap method down

                swap ( arr, i, correct );
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}