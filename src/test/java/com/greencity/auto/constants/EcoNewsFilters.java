package com.greencity.auto.constants;

import lombok.Getter;

@Getter
public enum EcoNewsFilters {
    NEWS("Новини"),
    EVENTS("Події"),
    COURSES("Курси"),
    INITIATIVES("Ініціативи"),
    ADS("Реклама");

    private final String filter;

    EcoNewsFilters(String filter) {
        this.filter = filter;
    }
}
