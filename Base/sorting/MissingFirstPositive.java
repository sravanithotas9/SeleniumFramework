package Com.java;
//leet-code 41.First Missing Positive (hard)
//question given unsorted array return the smallest missing positive integer..algorithm must should run in 0(n) time.
//by seeing question we can solve it by CYCLIC SORT
//we can solve by understand the question that ignore negative numbers and find positive numbers are correct with indexs
//if not in correct position return the smallest positive number.
//ex;{7,8,9,5} answer is 5 because index start with 0 and smallest positive is 5.

public class MissingFirstPositive {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        System.out.println (missingPositive(arr) );
    }
    static int missingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            //to ignore negatives we written arr[i]>0;edge cases arr[i]<arr.length;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap( arr, i, correct );
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        //arr.length+1 is used that if array sorted with same index then return n+1 integer {0,1,2,3}ans is 4;
        return arr.length+1;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}

