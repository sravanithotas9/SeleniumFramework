package Testng2;

import org.testng.annotations.*;

public class Afterclass_Beforeclass {
    @AfterClass
    public void closure() {
        System.out.println ( "closing the browser that is performed" );
    }
    @BeforeClass
    public void setup() {
        System.out.println ( "Launching the Chrome Browser and opening Application URL" );
    }

    @Test(priority = 1)
    public void testLogin() {
        System.out.println ( "login test got Executed" );
    }

    @Test(priority = 2)
    public void testRegistration() {
        System.out.println ( "registration test got Executed" );

    }

    @Test(priority = 3)
    public void testHome() {
        System.out.println ( "home test got Executed" );
    }
}

