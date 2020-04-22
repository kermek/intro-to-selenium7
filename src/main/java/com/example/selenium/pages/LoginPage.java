package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    By email = By.id("auth_email");
    By password = By.id("auth_pass");
    By submit = By.cssSelector(".auth-modal__submit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setEmail(String text) {
        driver.findElement(email).sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        driver.findElement(password).sendKeys(text);
        return this;
    }

    public LoginPage clickSubmit() {
        driver.findElement(submit).click();
        return this;
    }
}
