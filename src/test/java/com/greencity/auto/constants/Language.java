package com.greencity.auto.constants;

public enum Language {
    ENGLISH("En"),
    UKRAINIAN("Ua");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
