package com.greencity.auto.pages.elements;

import org.openqa.selenium.By;

public interface EventsPageElements {
    By mainTitleEventPage = By.cssSelector("h1[class='main-header']");
    By eventItem = By.cssSelector("div[class='event ng-star-inserted']");
    By createEventBtn = By.cssSelector("div[id='create-button']");
}
