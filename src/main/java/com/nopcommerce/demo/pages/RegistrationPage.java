package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

/*
Created by R-mak
 */

public class RegistrationPage extends Utility {

    By registerText = By.xpath("//div[@class='title']//strong[text()='Your Personal Details']");
    //By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By radioBtnLink = By.xpath("//span[@class='male']");
    By FirstNameField = By.id("FirstName");
    By LastNameField = By.id("LastName");
    By dayOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By checkBoxLink = By.xpath("//input[@id='Newsletter']");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerBtnClick = By.id("register-button");
    By registationCompletedText = By.xpath("//div[@class='page-body']//div[text()='Your registration completed']");
    By logOutOnNopCommerce = By.xpath("//a[@class='ico-logout']");



    public void assertTextYourPersonalDetail() {
        verifyText(registerText, "Your Personal Details");
    }
    public void clickOnRadioBtn(){
        clickOnElement(radioBtnLink);
    }
    public void enterFirstNameFiled(String Firstname){sendTextToElement(FirstNameField,Firstname);}
    public void enterLastNameField(String Lastname){ sendTextToElement(LastNameField,Lastname);}
    public void enterDayOfBirth(String Date){ sendTextToElement(dayOfBirth,Date);}
    public void enterMonthOfBirth(String Month){ sendTextToElement(monthOfBirth,Month);}
    public void enterYearOfBirth(String Year){sendTextToElement(yearOfBirth,Year);}
    public void enterEmailAddress(String Email){sendTextToElement(emailField,Email);}
    public void enterCompanyName(String Companyname){sendTextToElement(companyNameField,Companyname);}
    public void clickOnNewsletter(){clickOnElement(checkBoxLink);}
    public void enterPassword(String Password){sendTextToElement(passwordField,Password);}
    public void enterConfirmPassword(String Confirmpassword){sendTextToElement(confirmPasswordField,Confirmpassword);}
    public void clickOnSubmitBtn(){clickOnElement(registerBtnClick);}
    public void assertRegisterCompletedText() {
        verifyText(registationCompletedText, "Your registration completed");
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutOnNopCommerce);
    }

}
