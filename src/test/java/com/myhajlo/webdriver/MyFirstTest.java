package com.myhajlo.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by myhajlo.rozputnyj on 09.11.2016.
 */
public class MyFirstTest {
    @Test
  public void startWebDriver() {

        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\Firefox driver\\geckodriver.exe");
        WebDriver  driver = new FirefoxDriver();

        driver.navigate().to("http://seleniumsimplified.com/");

        Assert.assertTrue("title starts  differently",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
        }
}


