package com.greencity.auto.tests;

import com.greencity.auto.constants.User;
import com.greencity.auto.driver.DriverConfig;
import com.greencity.auto.facade.*;
import com.greencity.auto.pages.BasePage;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected BasePage basePage;
    protected BaseFacade baseFacade;
    protected EcoNewsItemFacade ecoNewsItemFacade;
    protected EcoNewsFacade ecoNewsFacade;
    protected PlacesFacade placesFacade;
    protected EventFacade eventFacade;
    protected LoginFacade loginFacade;

    @BeforeClass
    public void driverSetUp() {
        DriverConfig.initializeDriver();
        basePage = new BasePage();
        basePage.openPage();
        basePage.navigateToLoginPage()
                .logIn(User.User1.getEmail(), User.User1.getPassword());

        basePage = new BasePage();
        basePage.openPage();
        baseFacade = new BaseFacade();
        ecoNewsFacade = new EcoNewsFacade();
        ecoNewsItemFacade = new EcoNewsItemFacade();
        placesFacade = new PlacesFacade();
        eventFacade = new EventFacade();
        loginFacade = new LoginFacade();
    }
}
