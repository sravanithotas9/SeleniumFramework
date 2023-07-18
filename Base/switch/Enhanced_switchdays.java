package com.main1;

import java.util.Scanner;

public class Enhanced_switchdays {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int day =in.nextInt();


        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wedensday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

        }

        /*if we use switch enhanced for above switch case press alt+enter keys*/

        /*to become enhanced switch means alt+shift+enter*/


        switch ( day ) {
            case 1 -> System.out.println ( "monday" );
            case 2 -> System.out.println ( "tuesday" );
            case 3 -> System.out.println ( "wedensday" );
            case 4 -> System.out.println ( "thursday" );
            case 5 -> System.out.println ( "friday" );
            case 6 -> System.out.println ( "saturday" );
            case 7 -> System.out.println ( "sunday" );
        }

    }
}
