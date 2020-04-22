package com.example.selenium.steps;

import com.example.selenium.pages.BasePage;
import com.example.selenium.pages.MainPage;
import com.example.selenium.pages.ProductPage;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Steps {
    WebDriver driver;
    BasePage basePage;
    MainPage mainPage;
    ProductPage productPage;

    public Steps(WebDriver driver) {
        this.driver = driver;
        basePage = new BasePage(driver);
        mainPage = new MainPage(driver);
        productPage = new ProductPage(driver);
    }

    public Steps login(String email, String password) {
        basePage.open();
        mainPage.clickLogin()
                .setEmail(email)
                .setPassword(password)
                .clickSubmit();
        return this;
    }

    public Steps checkPrice(String product, String price) {
        mainPage.setSearch(product)
                .clickFind()
                .clickFound();

        assertThat(productPage.getPrice(), is(price));

        return this;
    }

    public Steps exit() {
        mainPage.clickName()
                .clickExit();
        return this;
    }
}
