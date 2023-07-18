package gpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classfive {

    @Parameters( {"URL"})
    @AfterTest
    public void testg() {
        System.out.println ( "This will be executed after every Test Module in the TestNg.xml file" );
    }

    @Test(groups = {"smoke"})
    public void testFive(){
        System.out.println ("testfive test of classfive got executed");
    }
}
