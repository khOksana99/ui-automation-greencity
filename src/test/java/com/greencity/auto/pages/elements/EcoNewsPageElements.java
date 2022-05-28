package com.greencity.auto.pages.elements;

import com.greencity.auto.constants.EcoNewsFilters;
import org.openqa.selenium.By;

public interface EcoNewsPageElements {
    By ecoNewsMainPageTitle = By.cssSelector("h1[class='main-header']");
    By filterBlock = By.xpath("//div[@class='flex-container']/app-tag-filter");
    By countOfNews = By.cssSelector("h2[class='ng-star-inserted']");
    By newsFilter = By.xpath("//span[text() = '"+ EcoNewsFilters.NEWS.getFilter() +"]");
    By eventsFilter = By.xpath("//span[text() = '"+ EcoNewsFilters.EVENTS.getFilter() +"']");
    By coursesFilter = By.xpath("//span[text() = '"+ EcoNewsFilters.COURSES.getFilter() +"]");
    By initiativesFilter = By.xpath("//span[text() = '"+ EcoNewsFilters.INITIATIVES.getFilter() +"]");
    By adsFilter = By.xpath("//span[text() = '"+ EcoNewsFilters.ADS.getFilter() +"]");
    By newsItem = By.cssSelector("li[class='gallery-view-li-active ng-star-inserted']");
    By newsItemFilter = By.cssSelector("div[class='ul-eco-buttons ng-star-inserted']");
}
