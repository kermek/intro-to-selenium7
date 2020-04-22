package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "auth_email")
    private WebElement email;

    @FindBy(how = How.ID, using = "auth_pass")
    private WebElement password;

    @FindBy(how = How.CSS, using = ".auth-modal__submit")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setEmail(String text) {
        email.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        password.sendKeys(text);
        return this;
    }

    public LoginPage clickSubmit() {
        submit.click();
        return this;
    }
}
