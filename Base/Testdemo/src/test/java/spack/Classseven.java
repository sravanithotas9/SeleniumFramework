package spack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classseven {

    @Parameters( {"URL"})

    @Test(groups = {"smoke"})
    public void testSeven() {
        System.out.println ( "testseven test of classseven got executed" );
    }
}
