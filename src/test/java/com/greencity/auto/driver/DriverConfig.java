package com.greencity.auto.driver;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Browsers.CHROME;


public class DriverConfig {

    private DriverConfig(){

    }

    public static void initializeDriver() {
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        Configuration.baseUrl = System.getProperty("env.url","https://console-qa.command.kw.com");
        Configuration.browser = CHROME;
        Configuration.downloadsFolder = "downloads";
        Configuration.startMaximized = true;
        Configuration.reopenBrowserOnFail = true;
    }

}
