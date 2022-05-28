package com.greencity.auto.facade;

import com.codeborne.selenide.Condition;
import com.greencity.auto.pages.EcoNewsItemPage;
import org.hamcrest.Matchers;

import static com.codeborne.selenide.Selenide.$;
import static com.greencity.auto.pages.elements.EcoNewsItemPageElements.ecoNewsItemPageMainTitle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class EcoNewsItemFacade extends BaseFacade<EcoNewsItemFacade> {
    private EcoNewsItemPage ecoNewsItemPage;
    private EcoNewsFacade ecoNewsFacade;

    public EcoNewsItemFacade() {
        ecoNewsItemPage = new EcoNewsItemPage();
        ecoNewsFacade = new EcoNewsFacade();
    }

    public EcoNewsItemFacade verifyStaticCheckOfEcoNewsItemPage() {
        ecoNewsItemPage
                .verifyEcoNewsItemCreatorIsDisplayed()
                .verifyEcoNewsItemCreationDateIsDisplayed()
                .verifyEcoNewsItemMainTitleIsDisplayed();
        return this;
    }

    public EcoNewsItemFacade verifyLikeEcoNewsItem() {
        $(ecoNewsItemPageMainTitle).shouldBe(Condition.visible);

        ecoNewsItemPage.likeEcoNews();
        assertThat("", ecoNewsItemPage.getLikesCount(), greaterThanOrEqualTo(1));
        return this;
    }

    public EcoNewsItemFacade commentEcoNews(String comment) {
        ecoNewsItemPage.scrollToBottom();
        ecoNewsItemPage.typeComment(comment);
        ecoNewsItemPage.sendComment();
        return this;
    }

    public EcoNewsItemFacade verifyComment(String comment) {
        ecoNewsItemPage.verifyCommentUserName();
        ecoNewsItemPage.verifyCommentText(comment);
        return this;
    }

    public EcoNewsItemFacade editComment(String editComment) {
        ecoNewsItemPage.editComment(editComment);
        ecoNewsItemPage.confirmEditComment();
        return this;
    }

    public EcoNewsItemFacade cancelEditComment(String editComment) {
        ecoNewsItemPage.editComment(editComment);
        ecoNewsItemPage.cancelEditComment();
        return this;
    }
}
