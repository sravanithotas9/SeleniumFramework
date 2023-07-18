package gpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classfour {

    @BeforeTest
    public void testm() {
        System.out.println ( "This will be executed before every Test Module in the TestNg.xml file" );
    }

    @Test
    public void testFour(){
        System.out.println ("testfour test of classfour got executed");
    }
}
