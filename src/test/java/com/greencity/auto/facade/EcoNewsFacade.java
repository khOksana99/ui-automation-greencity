package com.greencity.auto.facade;

import com.codeborne.selenide.Condition;
import com.greencity.auto.pages.EcoNewsItemPage;
import com.greencity.auto.pages.EcoNewsPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.greencity.auto.pages.elements.EcoNewsPageElements.ecoNewsMainPageTitle;
import static com.greencity.auto.pages.elements.EcoNewsPageElements.newsItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EcoNewsFacade extends BaseFacade<EcoNewsFacade> {
    private EcoNewsPage ecoNewsPage;

    public EcoNewsFacade() {
        ecoNewsPage = new EcoNewsPage();
    }

    public EcoNewsFacade staticCheckOfEcoNewsPage() {
        $(ecoNewsMainPageTitle).shouldBe(Condition.visible);

        ecoNewsPage
                .verifyEcoNewsMainTitleIsDisplayed()
                .verifyEcoNewsFilterBlockIsDisplayed()
                .verifyTitleOfEconewsPage();
        return this;
    }

    public EcoNewsFacade verifyEcoNewsFilteredCorrect() {
        $(newsItem).shouldBe(Condition.visible);

        ecoNewsPage.chooseEventsFilter();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int countOfNews = ecoNewsPage.getCountOfNews();
        List<String> filterLabelList = ecoNewsPage.getAllNewsItemsFilterTag();

        assertThat("", countOfNews, is(Math.toIntExact(ecoNewsPage.getFilteredFilterLabelsCount(filterLabelList))));
        return this;
    }

    public EcoNewsItemPage navigateToEcoNewsItem() {
        $(newsItem).shouldBe(Condition.visible);
        ecoNewsPage.navigateToEcoNewsItemPage();
        return new EcoNewsItemPage();
    }
}
