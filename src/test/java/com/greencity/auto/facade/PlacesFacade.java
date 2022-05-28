package com.greencity.auto.facade;

import com.codeborne.selenide.Condition;
import com.greencity.auto.pages.PlacesPage;

import static com.codeborne.selenide.Selenide.$;
import static com.greencity.auto.pages.elements.PlacesPageElements.searchPlacesBlock;

public class PlacesFacade extends BaseFacade<PlacesFacade> {
    private PlacesPage placesPage;

    public PlacesFacade() {
        placesPage = new PlacesPage();
    }

    public PlacesFacade staticCheckOfPlacesPage() {
        $(searchPlacesBlock).shouldBe(Condition.visible);
        placesPage.verifySearchPlacesBlockDisplayed();
        placesPage.verifyPlacesMapDisplayed();
        placesPage.verifyFilterBlockDisplayed();
        return this;
    }
}
