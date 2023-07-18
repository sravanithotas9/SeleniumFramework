package Testng2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethod {
    @BeforeMethod
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