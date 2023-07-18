package gpack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Classsix {

    @BeforeSuite
    public void testn(){
        System.out.println ("Before all the classes in the suite are executed");
    }
    @Test(groups = {"smile"},priority = 1)

    public void testSix(){
        System.out.println ("testsix test of classsix got executed");
    }
}
