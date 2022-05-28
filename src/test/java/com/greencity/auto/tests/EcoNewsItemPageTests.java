package com.greencity.auto.tests;

import com.greencity.auto.tests.BaseEcoNewsItemTest;
import org.testng.annotations.Test;

public class EcoNewsItemPageTests extends BaseEcoNewsItemTest {
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
