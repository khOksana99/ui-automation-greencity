package com.greencity.auto.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FilterNewsTest extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToEcoNewsPage();
    }

    @Test
    public void verifyFilterEcoNews() {
        ecoNewsFacade
                .verifyEcoNewsFilteredCorrect();
    }
}
