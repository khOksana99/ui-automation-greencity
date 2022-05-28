package com.greencity.auto.pages;

import com.greencity.auto.constants.EcoNewsFilters;
import com.greencity.auto.pages.elements.EcoNewsPageElements;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EcoNewsPage extends BasePage implements EcoNewsPageElements {
    public EcoNewsPage verifyEcoNewsMainTitleIsDisplayed() {
        assertThat("", $(ecoNewsMainPageTitle).isDisplayed());
        return this;
    }

    public EcoNewsPage verifyEcoNewsFilterBlockIsDisplayed() {
        assertThat("", $(filterBlock).isDisplayed());
        return this;
    }

    public EcoNewsPage verifyTitleOfEconewsPage() {
        assertThat("", $(ecoNewsMainPageTitle).text(), equalTo("Еко новини"));
        return this;
    }

    public List<String> getAllNewsItemsFilterTag() {
        return $$(newsItemFilter).texts();
    }

    public EcoNewsPage chooseEventsFilter() {
        $(eventsFilter).click();
        return this;
    }

    public int getCountOfNews() {
        return Integer.parseInt($(countOfNews).text().replaceAll("[^1-9]", ""));
    }

    public long getFilteredFilterLabelsCount(List<String> filterLabelList) {
        return filterLabelList.stream()
                .filter(label -> label.equalsIgnoreCase(EcoNewsFilters.EVENTS.getFilter()))
                .count();
    }

    public EcoNewsItemPage navigateToEcoNewsItemPage() {
        $(newsItem).click();
        return new EcoNewsItemPage();
    }
}
