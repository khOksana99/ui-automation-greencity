package com.greencity.auto.pages.elements;

import org.openqa.selenium.By;

public interface PlacesPageElements {
    By map = By.cssSelector("div[class='places-map']");
    By searchPlacesBlock = By.cssSelector("div[class='search-elements']");
    By placeFilterBlock = By.cssSelector("div[class='filter']");
}
