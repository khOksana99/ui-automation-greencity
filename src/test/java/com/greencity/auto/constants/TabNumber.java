package com.greencity.auto.constants;

public enum TabNumber {
    ECO_NEWS(1),
    EVENTS(2),
    PLACES(3),
    ABOUT_US(4),
    MY_SPACE(5),
    USB_COURIER(6);

    private final int tab;

    TabNumber(int tab) {
        this.tab = tab;
    }

    public int getTabNumber() {
        return tab;
    }
}
