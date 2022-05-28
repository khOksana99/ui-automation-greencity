package com.greencity.auto.pages;

import com.greencity.auto.pages.elements.LoginPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage  extends BasePage implements LoginPageElements {
    @Step("Log in")
    public BasePage logIn(String userName, String password) {
        $(userNameField).sendKeys(userName);
        $(passwordField).sendKeys(password);
        $(signInBtn).click();
        return this;
    }

    @Step("Verify main title is displayed")
    public LoginPage verifyMainTitleIsDisplayed() {
        assertThat("", $(loginPageMainTitle).isDisplayed());
        return this;
    }

    @Step("Verify description is displayed on login page")
    public LoginPage verifyDescriptionIsDisplayed() {
        assertThat("", $(loginPageDescription).isDisplayed());
        return this;
    }

    @Step("Verify Sign In With Google Btn is displayed")
    public LoginPage verifySignInWithGoogleBtnIsDisplayed() {
        assertThat("", $(signInWithGoogleBtn).isDisplayed());
        return this;
    }

    @Step("Verify sign up option is displayed on login page")
    public LoginPage verifySingUpOptionIsDisplayed() {
        assertThat("", $(signUpOption).isDisplayed());
        return this;
    }

    @Step("Verify sign up title is displayed")
    public LoginPage verifySignUpTitleIsDisplayed() {
        assertThat("", $(signUpTitle).isDisplayed());
        return this;
    }
}
