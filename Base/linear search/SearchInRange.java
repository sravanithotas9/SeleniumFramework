package com.linear.search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array={12,34,56,78,9,23,-1,-56};
        int target=23;
        int ans=linearsearch1(array,target,1,5);
        System.out.println (ans);
    }
    /*search the target and return the element*/
    static int linearsearch1(int[] array,int target,int start,int end){
        if(array.length==0){
            return-1;
        }
        /*run  a for loop*/
        for (int index= start ; index <=end ; index++) {
            /*check for  element at every index if it is equal to target*/
            int element = array[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    }

