package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Guru99HomePage;
import pages.Guru99Login;

public class DataProviders extends AbstractGuru{

    Guru99HomePage objHomePage;
    WebDriver driver = new ChromeDriver();
    Guru99Login objLogin = new Guru99Login(driver);

    @DataProvider(name="credentials")
    public static Object[][] getCredentials(){
        return new Object[][]{
                // username, password
                {"mgr123","mgr!23"},
                {"test","test"}
        };
    }

    @Test(dataProvider = "credentials")
    public void usingDataProvider(String userName,String password) {

        super.setup(driver);
        objLogin.loginToGuru99(userName, password);

    }

}
