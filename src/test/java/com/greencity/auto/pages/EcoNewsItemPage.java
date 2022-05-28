package com.greencity.auto.pages;

import com.greencity.auto.constants.User;
import com.greencity.auto.pages.elements.EcoNewsItemPageElements;

import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class EcoNewsItemPage extends BasePage implements EcoNewsItemPageElements {
    public EcoNewsItemPage verifyEcoNewsItemMainTitleIsDisplayed() {
        assertThat("", $(ecoNewsItemPageMainTitle).isDisplayed());
        return this;
    }

    public EcoNewsItemPage verifyEcoNewsItemCreationDateIsDisplayed() {
        assertThat("", $(newsItemCreationDate).isDisplayed());
        return this;
    }

    public EcoNewsItemPage verifyEcoNewsItemCreatorIsDisplayed() {
        assertThat("", $(newsItemCreator).isDisplayed());
        return this;
    }

    public EcoNewsItemPage likeEcoNews() {
        $(likeNewsItem).click();;
        return this;
    }

    public int getLikesCount() {
        return Integer.parseInt($(likesCountNewsItem).text());
    }

    public EcoNewsItemPage typeComment(String comment) {
        $(commentBlock).sendKeys(comment);
        return this;
    }

    public EcoNewsItemPage sendComment() {
        $(sendCommentBtn).click();
        return this;
    }

    public EcoNewsItemPage verifyCommentUserName() {
        assertThat("", $(commentUserName).text(), equalTo(User.User1.getUserName()));
        return this;
    }

    public EcoNewsItemPage verifyCommentText(String comment) {
        assertThat("", $(commentText).text(), equalTo(comment));
        return this;
    }

    public EcoNewsItemPage likeEcoNewsComment() {
        $(likeComment).click();;
        return this;
    }

    public int getLikeCommentCount() {
        return Integer.parseInt($(likeCommentCount).text());
    }

    public EcoNewsItemPage editComment(String editComment) {
        $(editCommentBtn).click();
        $(editTextBlock).sendKeys(editComment);
        return this;
    }

    public EcoNewsItemPage confirmEditComment() {
        $(saveEditBtn).click();
        return this;
    }

    public EcoNewsItemPage cancelEditComment() {
        $(cancelEditBtn).click();
        return this;
    }
}
