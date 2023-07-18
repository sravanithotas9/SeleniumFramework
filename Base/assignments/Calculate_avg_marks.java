package com.assignm;

import java.util.Scanner;

public class Calculate_avg_marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner ( System.in );
        int marks,fail = 0,pass=1;
        System.out.println ("enter the maths marks");
        int maths= sc.nextInt ();
        System.out.println ("enter the science marks");
        int science=sc.nextInt ();
        System.out.println ("enter the english marks");
        int english=sc.nextInt ();
        System.out.println ("enter the social marks");
        int social=sc.nextInt ();
        System.out.println ("enter the hindi marks");
        int hindi=sc.nextInt ();
        int total_marks=(maths+science+social+english+hindi);
        System.out.println ("total marks of all subjects is :" +total_marks);
        int avg_marks=(total_marks/5);
        System.out.println ("average marks of all subjects is:" +avg_marks);
        if(avg_marks <35) {
            marks = fail;
            System.out.println ("marks of fail is :" + marks);
        }
           else if (avg_marks >=35){
                marks =pass;
            System.out.println ("marks of pass is  :" +marks);

        }


    }
}
