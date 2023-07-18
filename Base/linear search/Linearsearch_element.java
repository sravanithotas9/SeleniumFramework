package com.linear.search;

public class Linearsearch_element {
    public static void main(String[] args) {
        int[] array={12,34,56,78,9,23,-1,-56};
        int target=23;
        int ans=linearsearch1(array,target);
        System.out.println (ans);
    }
      /*search the target and return the element*/
    static int linearsearch1(int[] array,int target){
        if(array.length==0){
            return-1;
        }
           /*run  a for loop*/
        for (int index = 0; index <array.length ; index++) {
            /*check for  element at every index if it is equal to target*/
            int element = array[index];
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    }

