package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage(); // object for home page
    LoginPage loginPage = new LoginPage(); // object for login page

    // verify log in test is failed with invalid email

    @Test
    public void verifyUserShoudNotLoginWithInvalidEmail() throws InterruptedException {
        homePage.clickOnLoginLink();
        loginPage.assertgetWelcomeText(); // verification of log in page by welcome text assert method
        Thread.sleep(2000);

        loginPage.enterEmailId("rravee12@gmail.com");
        loginPage.enterPasswordField("abc123");
        loginPage.cliconLoginBtn();
        loginPage.errorMassgeForInvalidEmail(); // verification of invalid email error msg assert method
    }

    // verify log in with valid email and password
    @Test
    public void verifyUserShouldLoginSuccessfully() throws InterruptedException {

        homePage.clickOnLoginLink();
        loginPage.assertgetWelcomeText(); // verification of log in page welcome text by assert method
        Thread.sleep(2000);

        loginPage.enterEmailId("luckyrbm@yahoo.com");
        loginPage.enterPasswordField("Namrata007");
        loginPage.cliconLoginBtn();
        loginPage.assergetWelcomeToStoreText(); // verification of log in successful by welcome to our store text assert method

    }

}
