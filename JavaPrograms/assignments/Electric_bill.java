package com.assignm;

import java.util.Scanner;

public class Electric_bill {
    public static void main(String[] args) {
        int units=280;

       double billpay=0;

        if(units<100)
        {
            billpay=units*2.22;
        }
        else if(units<300)
        {
            billpay=100*2.22+(units-100)*2;
        }
        else if(units>300)
        {
            billpay=100*2.22+200*2+(units-300)*3;
        }

        System.out.println("Bill to pay : " + billpay);
    }
}

