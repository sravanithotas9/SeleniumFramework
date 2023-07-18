package tpack;

import org.testng.annotations.*;

public class Classone {

    @AfterSuite
    public void testy() {
        System.out.println ( "After all the classes in the suite are executed" );
    }
    @BeforeMethod
    public void testmn(){
        System.out.println ("methods got sarted executing");
    }
    @AfterMethod
    public void testsn(){
        System.out.println ("methods got ended executing");
    }


    @Test(groups = {"smile"},priority = 2)
    public void testOne() {
        System.out.println ( "testone test of classone got executed" );
    }

    @Test
    public void testTen() {

        System.out.println ( "testten test of classone got executed" );
    }

    @Test
    public void testElev() {

        System.out.println ( "testelev test of classone got executed" );
    }
}
