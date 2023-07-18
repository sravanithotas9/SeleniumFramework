package database_concept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws SQLException, InterruptedException {

        Connection connection = DriverManager.getConnection ( "jdbc:mysql://localhost:3306/demo", "root", "Root" );

        //Get the data from employees table of demo database(3rd record)
       Statement statement= connection.createStatement ();
       ResultSet resultSet= statement.executeQuery ( "select * from logincredentials" );

 /*      while(resultSet.next ()){
           System.out.println (resultSet.getInt ( "id" ));//3
           System.out.println (resultSet.getString ( "name" ));//Test3
           System.out.println (resultSet.getString ( "place" ));//Guntur
           System.out.println (resultSet.getInt ( "experience" ));//5


       }*/
        WebDriverManager.chromedriver ().setup ();
        WebDriver driver=new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 1, TimeUnit.SECONDS );
        Thread.sleep ( 5000 );
        driver.get ( "https://tutorialsninja.com/demo/index.php?route=account/login");
        Thread.sleep ( 2000 );
        //if we use resultset.next() it will popup to next or else it will not works
        //here next is of giving of next data of single record
        //if we don't use next it will give exception
        //we can give resultset.next without while loop it will works
        while (resultSet.next ()) {

            driver.findElement ( By.id ( "input-email" ) ).sendKeys (resultSet.getString ("username"));
            Thread.sleep ( 2000 );
            driver.findElement ( By.id ( "input-password" ) ).sendKeys ( resultSet.getString ("password"));
            Thread.sleep ( 2000 );
            driver.findElement ( By.cssSelector ( "input[value='Login']" ) ).click ();
            Thread.sleep ( 2000 );
            driver.close ();


        }


    }

}
