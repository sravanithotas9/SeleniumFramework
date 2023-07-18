package com.sravani1;

import java.util.Scanner;

import static java.lang.System.in;

public class Conditional_loops {

    public static void main(String[] args) {

        int salary = 2000;

        if (salary > 5000) {
            salary = salary + 2000;
        }else{
            salary=salary+1000;
        }

        System.out.println(salary);
    }



}
