package com.techproed.pages;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AmazonRegisterPage {
    public AmazonRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ap_customer_name")
    public WebElement nameBox;
    //@FindBy(xpath = "//input[@id='ap_email']")
    @FindBy(id = "ap_email")
    public WebElement emailBox;
    @FindBy(id = "ap_password")
    public WebElement passwordBox;
    @FindBy(id = "ap_password_check")
    public WebElement rePasswordBox;
    @FindBy(id = "continue")
    public WebElement continueButton;
}