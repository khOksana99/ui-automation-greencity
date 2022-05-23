package com.greencity.auto.pages.elements;

import org.openqa.selenium.By;

public interface LoginPageElements {
    By userNameField = By.cssSelector("input[class='successful-email-validation ng-dirty ng-valid ng-touched']");
    By passwordField = By.cssSelector("input[class='ng-dirty ng-valid ng-touched']");
    By signInBtn = By.cssSelector("button[class='greenStyle']");
}
