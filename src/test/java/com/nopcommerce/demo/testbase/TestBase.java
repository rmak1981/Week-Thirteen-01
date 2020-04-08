package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.browserselector.BrowserSelector;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector selectBrowser = new BrowserSelector();
    String baseURL = "https://demo.nopcommerce.com/";

    @BeforeMethod
    public void openBrowser() {

        selectBrowser.selectBrowser("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @AfterMethod
    public void closeBrowser() {
        //driver.quit();
    }
}
