package com.greencity.auto.facade;

import com.codeborne.selenide.Condition;
import com.greencity.auto.pages.EventsPage;

import static com.codeborne.selenide.Selenide.$;
import static com.greencity.auto.pages.elements.EventsPageElements.mainTitleEventPage;

public class EventFacade extends BaseFacade<EventFacade> {
    private EventsPage eventsPage;

    public EventFacade() {
        eventsPage = new EventsPage();
    }

    public EventFacade staticCheckOfEventsPage() {
        $(mainTitleEventPage).shouldBe(Condition.visible);

        eventsPage.verifyEventPageCreateEventBtnDisplayed();
        eventsPage.verifyEventPageTitleDisplayed();
        eventsPage.verifyEventPageEventItemDisplayed();
        return this;
    }
}
