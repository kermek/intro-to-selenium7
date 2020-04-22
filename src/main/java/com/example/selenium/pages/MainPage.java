package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    By login = By.linkText("войдите в личный кабинет");
    By search = By.name("search");
    By find = By.cssSelector(".search-form__submit");
    By found = By.xpath("(//a[contains(@href, 'apple_macbook_air_2020')])");
    By name = By.linkText("иван");
    By exit = By.linkText("Выход");
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLogin() {
        driver.findElement(login).click();
        return new LoginPage(driver);
    }

    public MainPage setSearch(String text) {
        driver.findElement(search).sendKeys(text);
        return this;
    }

    public MainPage clickFind() {
        driver.findElement(find).click();
        return this;
    }

    public ProductPage clickFound() {
        driver.findElement(found).click();
        return new ProductPage(driver);
    }

    public MainPage clickName() {
        driver.findElement(name).click();
        return this;
    }

    public MainPage clickExit() {
        driver.findElement(exit).click();
        return this;
    }
}
