package com.greencity.auto.pages;

import com.greencity.auto.helpers.Utils;
import com.greencity.auto.pages.components.HeaderComponent;
import com.greencity.auto.pages.elements.BasePageElements;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.greencity.auto.pages.elements.HeaderComponentElements.*;

public class BasePage implements BasePageElements {
    private final HeaderComponent headerComponent = new HeaderComponent();

    /**
     * Open green city main page
     * @return this
     */
    public BasePage openPage() {
        open(Utils.PROPS.UI_URL_BASE());
        return this;
    }

    /**
     * Method navigates from base page to eco news page
     * @return new Eco news page
     */
    public EcoNewsPage navigateToEcoNewsPage() {
        $(ecoNewsTab).click();
        return new EcoNewsPage();
    }

    /**
     * Method navigates from base page to Events page
     * @return new Events page
     */
    public EventsPage navigateToEventsPage() {
        $(eventsTab).click();
        return new EventsPage();
    }

    /**
     * Method navigates from base page to Places page
     * @return new Places page
     */
    public PlacesPage navigateToPlacesPage() {
        $(ecoNewsTab).click();
        return new PlacesPage();
    }

    /**
     * Method navigates from base page to About Us page
     * @return new About Us page
     */
    public AboutUsPage navigateToAboutUsPage() {
        $(eventsTab).click();
        return new AboutUsPage();
    }

    /**
     * Method navigates from base page to My Space page
     * @return new My Space page
     */
    public MySpacePage navigateToMySpacePage() {
        $(ecoNewsTab).click();
        return new MySpacePage();
    }

    /**
     * Method navigates from base page to Usb CourierPage page
     * @return new Usb CourierPage page
     */
    public UsbCourierPage navigateToUsbCourierPage() {
        $(eventsTab).click();
        return new UsbCourierPage();
    }

    /**
     * Method navigates from base page to Login page
     * @return new Usb Login page
     */
    public LoginPage navigateToLoginPage() {
        $(signInOption).click();
        return new LoginPage();
    }

    public BasePage scrollToTop() {
        executeJavaScript("window.scrollBy(0, -document.body.scrollHeight*10)");
        return this;
    }

    public BasePage scrollToBottom() {
        executeJavaScript("window.scrollBy(0, document.body.scrollHeight*10)");
        return this;
    }
}
