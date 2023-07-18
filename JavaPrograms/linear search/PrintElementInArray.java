package com.linear.search;

import java.util.Arrays;

public class PrintElementInArray {
    public static void main(String[] args) {
        String name="sravani";
        char target='a';
        boolean ans = search2(name,target);
        System.out.println ( Arrays.toString (name.toCharArray ()) );

    }
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length ();i++){
            if(target==str.charAt(i)){
                return true;


            }

        }
        return false;
    }
}
