package tpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classtwo {

    @AfterTest
    public void testg() {
        System.out.println ( "This will be executed after every Test Module in the TestNg.xml file" );
    }
    @Parameters( {"URL"})
    @Test
    public void testTwo(){
        System.out.println ("testtwo test of classtwo got executed");

    }
    @Test
    public void testSev(){
        System.out.println ("testsev test of class got executed");
    }
    @Test
    public void testTwe(){
        System.out.println ("testtwe test of class got executed");
    }
}

