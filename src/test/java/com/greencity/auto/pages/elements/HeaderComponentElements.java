package com.greencity.auto.pages.elements;

import com.greencity.auto.constants.TabNumber;
import org.openqa.selenium.By;

public interface HeaderComponentElements {
    By greenCityLogo = By.cssSelector("a[class='header_logo active-link']");
    By ecoNewsTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.ECO_NEWS.getTabNumber() +"]");
    By eventsTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.EVENTS.getTabNumber() +"]");
    By placesTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.PLACES.getTabNumber() +"]");
    By aboutUsTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.ABOUT_US.getTabNumber() +"]");
    By mySpaceTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.MY_SPACE.getTabNumber() +"]");
    By usbCourierTab = By.xpath("//nav[@class='header_navigation-menu-left']/ul/li[" + TabNumber.USB_COURIER.getTabNumber() +"]");
    By languageOption = By.cssSelector("ul[class='header_lang-switcher-wrp header_navigation-menu-right-list']");
    By signInOption = By.cssSelector("a[class='header_sign-in-link tertiary-global-button']");
    By signedInUser = By.xpath("//a[@class='header_user-name']/span");
}
