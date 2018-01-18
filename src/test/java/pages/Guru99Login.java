package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;


public class Guru99Login implements Guru99pages {

    WebDriver driver;

    By user99GuruName = By.name("uid");
    By password99Guru = By.name("password");
    By titleText = By.className("barone");
    By login = By.name("btnLogin");
    By newCustomer = By.cssSelector(".menusubnav>li>a[href='addcustomerpage.php']");

    public String customerNameCSS = ".layout [onblur='validatecustomername();']";
    public String adressCSS = ".layout [onblur='validateAddress();']";
    public String cityCSS = ".layout [onblur='validateCity();']";
    public String stateCSS = ".layout [onblur='validateState();']";

    public String customerNameLabelCSS = ".layout table tr:nth-child(4)>td:first-child";
    public String adressLabelCSS = ".layout table tr:nth-child(7)>td:first-child";
    public String cityLabelCSS = ".layout table tr:nth-child(8)>td:first-child";
    public String stateLabelCSS = ".layout table tr:nth-child(9)>td:first-child";


    public Guru99Login(WebDriver driver) {

        this.driver = driver;

    }

    //Set user name in textbox


    public void setUserName(String strUserName) {

        driver.findElement(user99GuruName).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(String strPassword) {

        driver.findElement(password99Guru).sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin() {

        driver.findElement(login).click();

    }


    //Get the title of Login Page

    public String getLoginTitle() {

        return driver.findElement(titleText).getText();

    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strUserName
     * @param strPasword
     * @return
     */

    public void loginToGuru99(String strUserName, String strPasword) {

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();

    }


    //click New Customer

    public void clickNewCustomeBtn() {
        driver.findElement(newCustomer).click();
    }

    //these methods returns text of labels of New Customer form

    public String customerNameLabel() {
        return driver.findElement(By.cssSelector(customerNameLabelCSS)).getText().toLowerCase();
    }

    public String adressLabel() {
        return driver.findElement(By.cssSelector(adressLabelCSS)).getText().toLowerCase();
    }

    public String cityLabel() {
        return driver.findElement(By.cssSelector(cityLabelCSS)).getText().toLowerCase();
    }

    public String stateLabel() {
        return driver.findElement(By.cssSelector(stateLabelCSS)).getText().toLowerCase();
    }


    //This method creates map of<text of label of the each form field; field itself as webelement

    public Map<String, WebElement> createMap() {

        Map<String, WebElement> map = new HashMap<String, WebElement>();

        map.put(customerNameLabel(), driver.findElement((By.cssSelector(customerNameCSS))));
        map.put(adressLabel(), driver.findElement((By.cssSelector(adressCSS))));
        map.put(cityLabel(), driver.findElement((By.cssSelector(cityCSS))));
        map.put(stateLabel(), driver.findElement((By.cssSelector(stateCSS))));

        return map;
    }

    //method for iteration the map

    public void fillNewCustomerForm(Map<String, WebElement>map){
        for (Map.Entry<String, WebElement> entry : map.entrySet()) {
            // if (entry.getKey().equals("city")){
            //     System.out.println(entry.getValue());}
            entry.getValue().sendKeys("test");
        }
    }


    //Create array list for Customer Name, Address, City, State

//
//    public WebElement getCustomerNameField() {
//        WebElement CustomerNameField = driver.findElement(By.cssSelector(".layout [onblur='validatecustomername();']"));
//        return CustomerNameField;
//    }
//
//    public WebElement getAddressField() {
//        WebElement AddressField = driver.findElement(By.cssSelector(".layout [onblur='validateAddress();']"));
//        return AddressField;
//    }
//
//    public WebElement getCityFiels() {
//        WebElement CityFiels = driver.findElement(By.cssSelector(".layout [onblur='validateCity();']"));
//        return CityFiels;
//    }
//
//    public WebElement getState() {
//        WebElement State = driver.findElement(By.cssSelector(".layout [onblur='validateState();']"));
//        return State;
//    }

}




