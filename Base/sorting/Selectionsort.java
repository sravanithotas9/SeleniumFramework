package Com.java;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selection ( arr );
        System.out.println ( Arrays.toString (arr));

    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex ( arr, 0, lastIndex );
            swap ( arr, maxIndex, lastIndex );

        }
    }
        static void swap(int[] arr,int first,int second){
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;

        }
        static int getMaxIndex(int[] arr,int start,int end){
            int max=start;
            for (int i = start; i <= end; i++) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
            }
                return max;
                

        }
    }

