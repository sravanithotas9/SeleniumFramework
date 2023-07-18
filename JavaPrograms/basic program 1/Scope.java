package com.srithi;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "sravani";
        {
            /* int a=30; already intialised outside the block in the same method,hence you cannot intialise again*/
            a = 90; //reassign the original ref variable to some other value
            int c = 29;
            name = "srithika";
            System.out.println ( name );
            /*values intialised in this block will remain in block*/
            System.out.println ( a );
        }
        int c = 45;
        System.out.println ( a );
        System.out.println ( name );
        /*      System.out.println (c); cannot use outside the block */

    }

    static void random(int marks) {
        int num = 30;
        System.out.println ( num );
        System.out.println ( marks );

    }
}
