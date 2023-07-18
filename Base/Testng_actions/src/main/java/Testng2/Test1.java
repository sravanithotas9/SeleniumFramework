package Testng2;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {


    @Test
    public void Demo() throws Exception{
        //throws means ignoring Exceptions


        //this will give testcase passed 1 in TestNG Report
        System.out.println ( "sample Automation Script" );
        //this is how TestNG give Report failed 1
        int a = 10 / 0;//Arithmetic exception this is happen in Java automatically
        int age=5;
        if(age<18){
            //throw is manually trowing Exception when ever it is required
            throw new Exception ("Age cannot be less than 18");//Exception is from Java
            //skipException is from TestNG
            //throw new skipException ("Age cannot be less than 18");//Skipping the Exception in TestNG

        }


    }
}
