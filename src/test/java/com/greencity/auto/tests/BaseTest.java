package com.greencity.auto.tests;

import com.greencity.auto.driver.DriverConfig;
import com.greencity.auto.pages.BasePage;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected BasePage basePage;

    @BeforeClass
    public void driverSetUp() {
        DriverConfig.initializeDriver();
        basePage = new BasePage();
        basePage.openPage();
    }
}
