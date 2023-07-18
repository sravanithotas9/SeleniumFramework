package com.assignm;

import java.util.Scanner;

public class Calculate_marks_arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        int markarr[]=new int[5];
        int i,sum=0,avg;
        System.out.println ("enter 5 subject marks");
        for(i=0;i<5;i++) {
            markarr[i] = sc.nextInt ();
            sum = sum + markarr[i];
        }
            avg=sum/5;

        System.out.println ("sum of average marks =" +avg);


        }
    }

