package com.example.selenium.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().setSize(new Dimension(1680, 1027));
    }
}
