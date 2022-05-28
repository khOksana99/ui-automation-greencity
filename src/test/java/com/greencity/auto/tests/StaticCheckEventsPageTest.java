package com.greencity.auto.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StaticCheckEventsPageTest extends BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.navigateToEventsPage();
    }

    @Test
    public void staticCheckEventsPage() {
        eventFacade
                .staticCheckOfEventsPage();
    }
}
