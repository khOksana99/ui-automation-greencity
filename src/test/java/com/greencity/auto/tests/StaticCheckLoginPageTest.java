package com.greencity.auto.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaticCheckLoginPageTest extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToLoginPage();
    }

    @Test
    public void staticCheckLoginPageTest() {
        loginFacade
                .staticCheckOfLoginPage();
    }
}
