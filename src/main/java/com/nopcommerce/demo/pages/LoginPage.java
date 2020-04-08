package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']");
    //negative test case with invalid email address - verify error msg
    By errorMassge = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");
    //positive test case with successful log in - verify with assert text - welcome to store
    By welcomeStoreText = By.xpath("//div[@class='topic-block-title']//h2[text()='Welcome to our store']");

    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void cliconLoginBtn(){
        clickOnElement(loginBtn);
    }
    public void errorMassgeForInvalidEmail (){verifyText(errorMassge,"Login was unsuccessful. Please correct the errors and try again.\n" +
            "No customer account found");} // negative
    public void assertgetWelcomeText(){verifyText(welcomeText,"Welcome, Please Sign In!");}
    public void assergetWelcomeToStoreText(){verifyText(welcomeStoreText,"Welcome to our store");}


}
