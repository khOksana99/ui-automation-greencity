package com.greencity.auto.pages.elements;

import com.greencity.auto.constants.Language;
import org.openqa.selenium.By;

public interface LanguageComponentElements {
    By languageBlock = By.cssSelector("ul[class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']");
    By englishLanguageOption = By.xpath("//ul[@class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']/li/span[text()='" + Language.ENGLISH.getLanguage() + "']");
    By ukrainianLanguageOption = By.xpath("//ul[@class='add-shadow header_lang-switcher-wrp header_navigation-menu-right-list']/li/span[text()='" + Language.ENGLISH.getLanguage() + "']");
}
