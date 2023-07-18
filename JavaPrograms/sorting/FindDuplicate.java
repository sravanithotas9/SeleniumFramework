package Com.java;
//Leet-code 287.Find the Duplicate Number (medium) problem containing (n+1) integer,where each integer in the range (1,N)
//question asked in amazon & microsoft interview
//question solved by using CYCLIC SORT

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println ( duplicate ( arr ) );
    }

    static int duplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap ( arr, i, correct );
                }else {
                    return arr[i];
                }

            } else {
               i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}





