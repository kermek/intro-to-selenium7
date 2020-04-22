package com.example.selenium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RozetkaLoginTest extends BaseTest {

    @Test
    public void rozetkalogin() {
        basePage.open();
        mainPage.clickLogin()
                .setEmail("иван@mail.com")
                .setPassword("P@ssw0rd")
                .clickSubmit();
        productPage = mainPage.setSearch("MacBook Air 2020")
                .clickFind()
                .clickFound();

        assertThat(productPage.getPrice(), is("33 999₴"));

        mainPage.clickName()
                .clickExit();
    }
}
