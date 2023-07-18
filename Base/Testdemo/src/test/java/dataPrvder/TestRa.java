package dataPrvder;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestRa {

    @Test(dataProvider = "getInformation")

    public void loginPage(String username,String password){
        System.out.println ("user got successfully login username"+username+" password"+password);
    }

    @DataProvider
    public Object[][] getInformation(){

        Object[][] data= new Object[3][2];
        data[0][0]="Test";
        data[0][1]="1234";
        data[1][0]="Test1";
        data[1][1]="13256";
        data[2][0]="Test2";
        data[2][1]="14569";

      return data;
    }
}
