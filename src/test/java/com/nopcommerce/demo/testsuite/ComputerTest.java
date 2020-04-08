package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {

    HomePage homePage = new HomePage(); // home page object
    ComputerPage computerPage = new ComputerPage();    // computer page object
    DesktopPage desktopPage = new DesktopPage(); //  desktop page object

    public JavascriptExecutor jse; // jse for scroll

    @Test   // navigate to computer page test
    public void UserShouldNavigateToComputerPage() {
        homePage.clickOnComputerLink();
        computerPage.assertComputerText();
    }
    @Test // adding product to shopping cart test
    public void UserShouldAddProductToShoppingCartFromComputerPage() throws InterruptedException {
        homePage.clickOnComputerLink(); // navigate to computer link
        Thread.sleep(3000);
        computerPage.clickOnDesktopButton(); // desktop selected

        //to scrol the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");

        Thread.sleep(2000);
        desktopPage.clickOnBuiltYourOwnComputerLink();

        //to scroll the page down
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-1800);");
        Thread.sleep(2000);

        desktopPage.clickOn400GBHarddrive(); // select 400 gb hd
        desktopPage.clickAddToCartButton(); // add to cart
        desktopPage.assertProductAddSuccessfullyText(); // verify add to cart by text assert method

    }
}
