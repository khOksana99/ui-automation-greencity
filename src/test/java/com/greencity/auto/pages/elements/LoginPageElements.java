package com.greencity.auto.pages.elements;

import org.openqa.selenium.By;

public interface LoginPageElements {
    By loginPageMainTitle = By.xpath("//app-sign-in[@class='ng-star-inserted']/h1");
    By loginPageDescription = By.xpath("//app-sign-in[@class='ng-star-inserted']/h2");
    By userNameField = By.cssSelector("input[id='email']");
    By passwordField = By.cssSelector("input[id='password']");
    By signInBtn = By.cssSelector("button[class='greenStyle']");
    By signInWithGoogleBtn = By.cssSelector("button[class='google-sign-in']");
    By signUpOption = By.cssSelector("a[class='green-link']");
    By signUpTitle = By.xpath("//div[@class='missing-account']/p");
}
