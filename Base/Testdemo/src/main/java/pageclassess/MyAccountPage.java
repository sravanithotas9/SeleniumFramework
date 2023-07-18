package pageclassess;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver ) {

        this.driver = driver;


        PageFactory.initElements (driver,this);
    }


    //page object model
    // private By accountBreadCrumb= By.xpath ( "//a[normalize-space()='Account']" );

    @FindBy(xpath="//a[normalize-space()='Account']")

    private WebElement accountBreadCrumb;

    public WebElement accountBreadCrumb(){

        return accountBreadCrumb;
    }
}

