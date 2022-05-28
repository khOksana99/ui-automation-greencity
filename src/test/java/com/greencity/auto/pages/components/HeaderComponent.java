package com.greencity.auto.pages.components;

import com.greencity.auto.pages.elements.HeaderComponentElements;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponent implements HeaderComponentElements {
    public String getSignedInUserName() {
        return $(signedInUser).text();
    }
}
