package com.example.selenium;

import com.example.selenium.pages.BasePage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.pages.ProductPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    BasePage basePage;
    MainPage mainPage;
    ProductPage productPage;
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
