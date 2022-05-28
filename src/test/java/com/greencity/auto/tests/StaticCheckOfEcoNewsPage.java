package com.greencity.auto.tests;

import com.greencity.auto.facade.EcoNewsFacade;
import com.greencity.auto.tests.BaseEcoNewsTest;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Static check of econews page")
public class StaticCheckOfEcoNewsPage extends BaseEcoNewsTest {
    private EcoNewsFacade ecoNewsFacade = new EcoNewsFacade();

    @Test
    public void staticCheckEcoNewsPage() {
        basePage.navigateToEcoNewsPage();

        ecoNewsFacade.staticCheckOfEcoNewsPage();
    }
}
