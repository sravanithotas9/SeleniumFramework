package com.assignm;

import java.util.Scanner;

public class Greeting_message {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String name= in.nextLine();

        System.out.println(name);

        System.out.println("hello"  +name);


    }
}
