package com.main1;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        /*if switch statement you can jump to various cases based on your expressions
        * syntax:
        * switch(expression){
        * //case
        * case one:
        * //do something
        * break;
        * case two:
        * //do something
        * break;
        * default
        * //do something
        * } */
        Scanner in =new Scanner(System.in);
        String fruit = in.next();
        /*to convert into enhanced switch----> windows:alt+enter*/

        switch(fruit){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("a sweet red fruit");
                break;
            case "orange":
                System.out.println("a round fruit");
                break;
            case "grape":
                System.out.println("a small fruit");
                break;
            default:
                System.out.println("enter valid fruit");
        }

    }
}
