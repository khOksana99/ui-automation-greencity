package com.greencity.auto.tests;

import com.greencity.auto.tests.BaseEcoNewsItemTest;
import org.testng.annotations.Test;

public class CommentEcoNewsTests extends BaseEcoNewsItemTest {
    private final String comment = "Comment";
    private final String editComment = "Edited comment";
    private final String cancelEditComment = "Canceled edit comment";

    @Test(priority = 1)
    public void verifyCommentEcoNewsTest() {
        ecoNewsItemFacade
                .commentEcoNews(comment)
                .verifyComment(comment);
    }

    @Test(priority = 2)
    public void verifyCancelEditComment() {
        ecoNewsItemFacade
                .cancelEditComment(cancelEditComment)
                .verifyComment(comment);
    }
}
