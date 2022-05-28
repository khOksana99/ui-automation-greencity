package com.greencity.auto.pages.elements;

import org.openqa.selenium.By;

public interface EcoNewsItemPageElements {
    By ecoNewsItemPageMainTitle = By.cssSelector("div[class='news-title word-wrap']");
    By newsItemCreationDate = By.cssSelector("div[class='news-info-date']");
    By newsItemCreator = By.cssSelector("div[class='news-info-author']");
    By likeNewsItem = By.cssSelector("img[class='news_like ng-star-inserted']");
    By likesCountNewsItem = By.cssSelector("span[class='numerosity_likes']");
    By commentBlock = By.cssSelector("textarea[placeholder='Додати коментар']");
    By sendCommentBtn = By.cssSelector("button[class='primary-global-button']");
    By commentUserName = By.cssSelector("span[class='author-name']");
    By commentText = By.cssSelector("p[class='comment-text ng-star-inserted']");
    By likeComment = By.cssSelector("div[class='comment-likes']");
    By likeCommentCount = By.cssSelector("span[class='like-amount']");
    By editCommentBtn = By.cssSelector("button[class='cta-btn edit']");
    By editTextBlock = By.cssSelector("div[class='comment-edit-text ng-star-inserted']");
    By saveEditBtn = By.cssSelector("button[class='cta-btn save-edit']");
    By cancelEditBtn = By.cssSelector("button[class='cta-btn cancel-edit']");
    By deleteCommentBtn = By.cssSelector("button[class='cta-btn delete']");
    By replyCommentBtn = By.cssSelector("button[class='cta-btn reply']");
    By replyTextBlock = By.cssSelector("textarea[class='reply-width ng-pristine ng-invalid ng-touched']");
    By confirmReplyBtn = By.cssSelector("button[class='primary-global-button']");
    By lookAtReply = By.cssSelector("span[class='btn-text']");
}
