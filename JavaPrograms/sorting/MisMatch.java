package Com.java;

import java.util.Arrays;

//leet-code 645.Set Mismatch (easy) asked in amazon
//question given in the range [1,n] some error is there we have to correct it by giving output
//repetition of one number and loss of other number.
//we have to slove it by CYCLIC SORT
public class MisMatch {

    public static void main(String[] args) {
        int[] array={1,2,2,4};
        int[] ans=mismatch(array);
        System.out.println ( Arrays.toString (ans));

    }

    static int[] mismatch(int[] array) {
        int i = 0;
        while (i < array.length) {
            //here array[i]-1 is written for[1,n] else array[i]is written for[0,n]
            int correct = array[i] - 1;
            if (array[i] != array[correct]) {
                swap ( array, i, correct );

            } else {
                i++;

            }
        }
        //searching for missing  number
        //here index+1 is written for[1,n] else index is written for[0,n]

        for (int index = 0; index < array.length; index++) {
            if (array[index] != index + 1) {
                return new int[] {array[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}

