package com.greencity.auto.tests;

import com.greencity.auto.tests.BaseEcoNewsTest;
import org.testng.annotations.Test;

public class FilterNewsTest extends BaseEcoNewsTest {
    @Test
    public void verifyFilterEcoNews() {
        ecoNewsFacade
                .verifyEcoNewsFilteredCorrect();
    }
}
