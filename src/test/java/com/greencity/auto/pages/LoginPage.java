package com.greencity.auto.pages;

import com.greencity.auto.pages.elements.LoginPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage  extends BasePage implements LoginPageElements {
    @Step("Log in")
    public BasePage logIn(String userName, String password) {
        $(userNameField).sendKeys(userName);
        $(passwordField).sendKeys(password);
        $(signInBtn).click();
        return this;
    }
}
