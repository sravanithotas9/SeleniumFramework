package Testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_checkpoints {
    @Test
    public void testone(){
        Assert.assertEquals ( 9,9 );//TRUE
        Assert.assertEquals ( 9,5 );//FAIL
        Assert.assertEquals ( "HI","HELLO" );//FAIL
        Assert.assertEquals ( "HELLO","HELLO" );//TRUE


        int a=5,b=10;
        Assert.assertTrue ( a<b );//true
        Assert.assertTrue ( a>b );//false

        Assert.assertNotEquals ( "hi","bye" );//pass because we given assernotequals they are no equal
        Assert.assertNotEquals ( "hello","hello" );//fail because we given assertnotequals but they are same

        int i=6,j=3;
        Assert.assertFalse ( a<b );//pass because we given assertfalse
        Assert.assertFalse ( a>b );//fail because we given assertfalse

        int age=5;
        if(age<18){
            //we given correct condition but we used assert fail so it is passed we are manually failing the test case by giving assert fail
            Assert.fail ("Age cannot be less than 18");
        }

        int age1=5;
        if(age1>18){
            //we given wrong condition but we used assert fail so it will fail the test case we are manually trying to fail the test case by giving assert fail it will pass
            Assert.fail ("Age1 can be greater than 15");
        }
    }

}
