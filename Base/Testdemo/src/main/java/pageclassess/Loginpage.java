package pageclassess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {


    /*ABSTRACTION:
    the process of private locators means hidding the data(cannot see by the user) and public methods means can see by the user,
    this process is known as abstraction: Hiding the things that should not be directly accessed by the user by making them private.
*/
    //ENCAPSULATION:Variables and Methods inside the class

    WebDriver driver;

    //here login page driver and login test driver are different we have to connect the both drivers by using constructor,
    // constructor doesn't have return type.
    //constructor should be same as class name.

    public Loginpage(WebDriver driver) {

    this.driver=driver;

    //this is taken from PAGE FACTORY to identify this

       PageFactory.initElements ( driver,this);



    //here this. driver indicates WebDriver driver and just driver indicates loginTest class driver(constructor driver).

        //same thing is used for myaccountpage driver and myaccounttest driver.
        //here driver as constructor should create in object.
}

   /* These design pattern of writing locators belongs to PAGE OBJECT MODEL
    private By emailField= By.id ( "input-email" );
    private By passwordField= By.id ( "input-password" );
    private By loginButton= By.cssSelector ( "input[value='Login']" );
*/


//@find by is taken from the PAGE FACTORY design it deals with selenium
    //if we combine page object model + page factory we will get good design framework with readability and maintained

    @FindBy(id="input-email")
    private WebElement emailField;

    @FindBy(id="input-password")
    private WebElement passwordField;

    @FindBy(css= "input[value='Login']" )
    private WebElement loginButton;

    public WebElement emailField(){

        return  emailField ;

    }

    public WebElement passwordField(){

        return  passwordField ;

    }

    public WebElement loginButton (){

        return  loginButton ;

    }
}
