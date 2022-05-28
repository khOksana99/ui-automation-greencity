package com.greencity.auto.pages;

import com.greencity.auto.pages.elements.EventsPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;

public class EventsPage extends BasePage implements EventsPageElements {
    @Step("Verify event page title is displayed")
    public EventsPage verifyEventPageTitleDisplayed() {
        assertThat("", $(mainTitleEventPage).isDisplayed());
        return this;
    }

    @Step("Verify event page event title is displayed")
    public EventsPage verifyEventPageEventItemDisplayed() {
        assertThat("", $(eventItem).isDisplayed());
        return this;
    }

    @Step("Verify event page create event btn is displayed")
    public EventsPage verifyEventPageCreateEventBtnDisplayed() {
        assertThat("", $(createEventBtn).isDisplayed());
        return this;
    }
}
