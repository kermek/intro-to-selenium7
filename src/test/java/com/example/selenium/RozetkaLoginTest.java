package com.example.selenium;

import org.junit.Test;

public class RozetkaLoginTest extends BaseTest {

    @Test
    public void rozetkalogin() {
        steps.login("иван@mail.com", "P@ssw0rd")
                .checkPrice("MacBook Air 2020", "33 999₴")
                .exit();
    }
}
