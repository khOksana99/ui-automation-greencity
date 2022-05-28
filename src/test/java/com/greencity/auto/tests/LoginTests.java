package com.greencity.auto.tests;

import com.greencity.auto.constants.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToLoginPage();
    }

    @Test
    public void verifySuccessfulLogin() {
        loginFacade
                .verifyUserIsLogin(User.User1);
    }
}
