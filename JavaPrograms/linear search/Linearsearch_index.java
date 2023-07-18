package com.linear.search;

public class Linearsearch_index {
    public static void main(String[] args) {
        int[] array={12,34,56,78,9,23,-1,-56};
        int target=23;
        int ans=linearsearch(array,target);
        System.out.println (ans);

    }
    /*search in the array :return the index if item is found*/
    /*otherwise if item not found return -1*/
    static int linearsearch(int[] array,int target){
      if(array.length==0){
      return-1;
  }
        for (int index = 0; index <array.length ; index++) {
            /*check for  element at every index if it is equal to target*/
            int element = array[index];
            if(element==target){
                return index;
            }


        }
        return -1;
    }
}
