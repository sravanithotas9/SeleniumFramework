package Testng2;

import org.testng.annotations.Test;

public class PriorityConcept {

    @Test
    public void loginPage() {
        System.out.println ( "login test got Executed" );
    }

    @Test
    public void registrationPage() {
        System.out.println ( "registration test got Executed" );

    }

    @Test
    public void homePage() {
        System.out.println ( "home test got Executed" );
    }

    //To Priority the test first to get executed we have to use priority attribute is used.In general test methods are
    //executed in alphabatical manner in group og methods

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