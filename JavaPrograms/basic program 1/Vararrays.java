package com.srithi;

import java.util.Arrays;

public class Vararrays {
    public static void main(String[] args) {
        /*fun ( 2, 3, 67, 89, 90 );

        multiple ( 20, 56, "sravani", "srithika", "dileep" );*/
      /*
        demo (20,30,56);
        demo("sravani","srithi","dileep");*/
        // demo(); //overloading varaiables if we not giving anything in function it shows as error


    }

    static void demo(int... v) {


        System.out.println ( Arrays.toString ( v ) );
    }

    static void demo(String... v) {
        System.out.println ( Arrays.toString ( v ) );
    }
}
  /* static void multiple(int a,int b,String...v){


        System.out.println (Arrays.toString (v));
    }
    static void fun(int...v){
        System.out.println ( Arrays.toString(v));
    }
}
*/