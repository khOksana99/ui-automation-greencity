package com.greencity.auto.tests;

import com.greencity.auto.facade.EcoNewsItemFacade;
import org.testng.annotations.BeforeClass;

public class BaseEcoNewsItemTest extends BaseEcoNewsTest {
    protected EcoNewsItemFacade ecoNewsItemFacade;

    @BeforeClass
    public void setUp() {
        ecoNewsItemFacade = new EcoNewsItemFacade();
        ecoNewsFacade.navigateToEcoNewsItem();
    }
}
