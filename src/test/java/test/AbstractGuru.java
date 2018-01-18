package test;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

abstract class AbstractGuru {

   public void setup(WebDriver driver){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");

    }
}
