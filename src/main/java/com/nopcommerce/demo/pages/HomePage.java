package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.xpath("//a[@class='ico-login']");
    By registerLink = By.linkText("Register");
    By computerLink = By.linkText("Computers");

//    By computerLink = By.partialLinkText("Compute");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }

    public void clickonRegisterLink(){
        clickOnElement(registerLink);
    }

    public void clickOnComputerLink(){
        clickOnElement(computerLink);
    }

}
