package com.greencity.auto.tests;

import io.qameta.allure.Feature;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Feature("Static check of econews page")
public class StaticCheckOfEcoNewsPage extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToEcoNewsPage();
    }

    @Test
    public void staticCheckEcoNewsPage() {
        basePage.navigateToEcoNewsPage();

        ecoNewsFacade.staticCheckOfEcoNewsPage();
    }
}
