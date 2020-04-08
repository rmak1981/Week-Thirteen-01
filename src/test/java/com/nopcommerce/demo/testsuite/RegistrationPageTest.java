package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.nopcommerce.demo.utility.Utility.getRandomString;

public class RegistrationPageTest extends TestBase {

    static String email = null;
    String password = "xyz123";

    HomePage homePage = new HomePage(); // Object created for homepage
    RegistrationPage registrationPage = new RegistrationPage(); //  object created for Registration page
//  Before test this method will generate random email for reg
    @BeforeTest
    public static void setUp(){

        email = "ravi" + getRandomString(6) + "@gmail.com";
    }
// all the test case to check the scenario
    @Test
    public void verifyUserShouldRegisterSuccessfully(){

        homePage.clickonRegisterLink(); // click on register linn on home page
        registrationPage.assertTextYourPersonalDetail();// verification to be on registration page with text match
        registrationPage.clickOnRadioBtn();// click on radio button to select gender
        registrationPage.enterFirstNameFiled("Ravikumar");
        registrationPage.enterLastNameField("Makwana");
        registrationPage.enterDayOfBirth("1");
        registrationPage.enterMonthOfBirth("jan");
        registrationPage.enterYearOfBirth("1982");
        registrationPage.enterEmailAddress(email);// random email sent to email field
        registrationPage.enterCompanyName("r m test");
        registrationPage.clickOnNewsletter();// check box selection to newsletter
        registrationPage.enterPassword(password);
        registrationPage.enterConfirmPassword(password);
        registrationPage.clickOnSubmitBtn();
        registrationPage.assertRegisterCompletedText();// verification for registration completed by text comparision
        registrationPage.clickOnLogOutButton(); // log out
    }
}
