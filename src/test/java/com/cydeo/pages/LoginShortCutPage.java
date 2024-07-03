package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginShortCutPage {

    public LoginShortCutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[text() = 'Sign in']")
    public WebElement buttonSign;

}
