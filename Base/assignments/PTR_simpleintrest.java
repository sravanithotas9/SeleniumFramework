package com.assignm;

import java.util.Scanner;

public class PTR_simpleintrest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

       int P =6 ,T=500,R =8; /*we can use int/float*/

        int  SI = (P*T*R)/100;
        System.out.println(SI);
    }
}
