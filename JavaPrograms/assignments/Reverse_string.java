package com.assignm;

public class Reverse_string {
    public static void main(String[] args) {
        Integer[] intArray={23,24,67,89,89};
        System.out.println ("original array is");
        for(int i=0;i< intArray.length;i++){
            System.out.println (intArray[i] + " ");
        }
        System.out.println ("original array print in reverse order");
        for(int i= intArray.length-1;i>=0;i--){
            System.out.println (intArray[i] + " ");
        }


    }
}
