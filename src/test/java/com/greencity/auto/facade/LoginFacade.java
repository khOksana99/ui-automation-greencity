package com.greencity.auto.facade;

import com.codeborne.selenide.Condition;
import com.greencity.auto.constants.User;
import com.greencity.auto.pages.LoginPage;
import com.greencity.auto.pages.components.HeaderComponent;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.greencity.auto.pages.elements.HeaderComponentElements.greenCityLogo;
import static com.greencity.auto.pages.elements.LoginPageElements.loginPageMainTitle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginFacade extends BaseFacade<LoginFacade> {
    private final LoginPage loginPage;
    private final HeaderComponent headerComponent;

    public LoginFacade() {
        loginPage = new LoginPage();
        headerComponent = new HeaderComponent();
    }

    @Step("Verify static check of login page")
    public LoginFacade staticCheckOfLoginPage() {
        $(loginPageMainTitle).shouldBe(Condition.visible);

        loginPage
                .verifyMainTitleIsDisplayed()
                .verifyDescriptionIsDisplayed()
                .verifySignUpTitleIsDisplayed()
                .verifySignInWithGoogleBtnIsDisplayed()
                .verifySingUpOptionIsDisplayed();
        return this;
    }

    public LoginFacade verifyUserIsLogin(User user) {
        loginPage
                .logIn(user.getEmail(), user.getPassword());

        $(greenCityLogo).shouldBe(Condition.visible);
        assertThat("", user.getUserName(), equalTo(headerComponent.getSignedInUserName()));
        return this;
    }
}
