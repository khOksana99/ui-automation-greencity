package com.greencity.auto.facade;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.greencity.auto.pages.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;

public class BaseFacade<T extends BaseFacade<T>>{
    private BasePage basePage;

    public BaseFacade() {
        basePage = new BasePage();
    }

    @Step("Refresh page")
    public T refreshPage() {
        Selenide.refresh();
        return (T) this;
    }

    @Step("User scroll to top of the page")
    public T scrollToTop() {
        basePage.scrollToTop();
        return (T) this;
    }

    @Step("User scroll to bottom of the page")
    public T scrollToBottom() {
        basePage.scrollToBottom();
        return (T) this;
    }
}
