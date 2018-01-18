package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Guru99HomePage;
import pages.Guru99Login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test99GuruLogin extends AbstractGuru {

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    WebDriver driver = new ChromeDriver();


    /**
     * This test case will login in http://demo.guru99.com/V4/
     * <p>
     * Verify login page title as guru99 bank
     * <p>
     * Login to application
     * <p>
     * Verify the home page using Dashboard message
     */

    @Test(priority = 0)

    public void test_Home_Page_Appear_Correct() {

        super.setup(driver);


        System.out.println("Test");


        //Verify login page title

        String loginPageTitle = objLogin.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

        //login to application

        objLogin.loginToGuru99("mgr123", "mgr!23");

        // go the next page

        objHomePage = new Guru99HomePage(driver);

        //Verify home page

        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

        //Click new customer

        objLogin.clickNewCustomeBtn();

        //Fill fprm with text "test"

        List<WebElement> TextForm = new ArrayList<WebElement>();

        TextForm.add(driver.findElement(By.cssSelector(objLogin.customerNameCSS)));
        TextForm.add(driver.findElement(By.cssSelector(objLogin.adressCSS)));
        TextForm.add(driver.findElement(By.cssSelector(objLogin.cityCSS)));
        TextForm.add(driver.findElement(By.cssSelector(objLogin.stateCSS)));

        for (WebElement element : TextForm) {

            element.sendKeys("test");
        }

    }

    /**
     * This test case will login in http://demo.guru99.com/V4/
     * <p>
     * Login to application
     * Create map, iterate thru all entries and type "test"
     * <p>
     *
     */
    @Test(priority = 0)

    public void test_HashMap() {

        //Create Login Page object

        objLogin = new Guru99Login(driver);

        //login to application

        objLogin.loginToGuru99("mgr123", "mgr!23");

        // go the next page

        objHomePage = new Guru99HomePage(driver);

        //Click new customer

        objLogin.clickNewCustomeBtn();


//        System.out.println("WebElement with label city: " + map.get("city"));
//
//        map.get("city").sendKeys("test");

        objLogin.fillNewCustomerForm(objLogin.createMap());

    }


    @Test(priority = 0)

    public void test() {

        List<String> a1 = new ArrayList<String>();
        a1.add("el1");
        a1.add("ell2");
        a1.add("ell3");
        a1.add("ell4");
        a1.remove(0);

        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(31, "Kate");
        m.put(27, "Ronni");
        m.remove(27);

//        for (Map.Entry<Integer, String> en: m.entrySet()){
//            System.out.println(en.getKey() + " " +en.getValue());}
//
//        for (int i=0;i<a1.size();i++ ) {
//            System.out.println(a1.get(i));
//    }
//        for (String a:a1){
//            System.out.println(a);
//        }
//
        if (a1.size() > 5) {
            System.out.println("Element with index 5 is " + a1.get(5));
        } else {
            System.out.println("Length is " + a1.size() + " elements");

        }


    }


}
