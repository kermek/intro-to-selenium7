package com.example.selenium;

import com.example.selenium.steps.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected Steps steps;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        steps = new Steps(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
