package tpack;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Classthree {
    @BeforeTest
    public void testM(){
        System.out.println ("This will be executed before every Test Module in the TestNg.xml file");
    }
    @Test
    public void testThree(){
        System.out.println ("testthree test of class three got executed");

    }
    @Test(groups = {"smoke"})
    public void testNine(){
        System.out.println ("testnine test of class nine got executed");

    }
    @Test
    public void testFourteen(){
        System.out.println ("testfourteen test of class fourteen got executed");

    }

}

