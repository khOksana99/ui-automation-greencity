package com.greencity.auto.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EcoNewsItemPageTests extends BaseTest {

    @BeforeClass
    public void setUp() {
        ecoNewsFacade.navigateToEcoNewsItem();
    }

    @Test
    public void staticCheckOfEcoNewsItemPageTest() {
        ecoNewsItemFacade
                .verifyStaticCheckOfEcoNewsItemPage();
    }

    @Test
    public void verifyLikeEcoNewsItemTest() {
        ecoNewsItemFacade
                .verifyLikeEcoNewsItem();
    }
}
