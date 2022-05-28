package com.greencity.auto.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaticCheckPlacesPageTest extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToPlacesPage();
    }

    @Test
    public void staticCheckPlacesPage() {
        placesFacade
                .staticCheckOfPlacesPage();
    }
}
