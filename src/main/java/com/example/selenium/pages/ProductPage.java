package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    By price = By.cssSelector(".product-prices__big");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getPrice() {
        return driver.findElement(price).getText();
    }
}
