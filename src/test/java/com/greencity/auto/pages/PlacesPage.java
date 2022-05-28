package com.greencity.auto.pages;

import com.greencity.auto.pages.elements.PlacesPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlacesPage extends BasePage implements PlacesPageElements {
    @Step("Verify places map is displayed")
    public PlacesPage verifyPlacesMapDisplayed() {
        assertThat("", $(map).isDisplayed());
        return this;
    }

    @Step("Verify filter block is displayed")
    public PlacesPage verifyFilterBlockDisplayed() {
        assertThat("", $(placeFilterBlock).isDisplayed());
        return this;
    }

    @Step("Verify search places block is displayed")
    public PlacesPage verifySearchPlacesBlockDisplayed() {
        assertThat("", $(searchPlacesBlock).isDisplayed());
        return this;
    }
}
