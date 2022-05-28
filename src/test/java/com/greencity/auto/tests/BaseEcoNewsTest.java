package com.greencity.auto.tests;

import com.greencity.auto.constants.User;
import com.greencity.auto.facade.EcoNewsFacade;
import com.greencity.auto.tests.BaseTest;
import org.testng.annotations.BeforeClass;

public class BaseEcoNewsTest extends BaseTest {
    protected EcoNewsFacade ecoNewsFacade;

    @BeforeClass
    public void setUpEcoNewsPage() {
        ecoNewsFacade = new EcoNewsFacade();

        basePage.navigateToLoginPage()
                .logIn(User.User1.getEmail(), User.User1.getPassword())
                .navigateToEcoNewsPage();
    }
}
