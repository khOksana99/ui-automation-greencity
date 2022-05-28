package com.greencity.auto.constants;

import lombok.Getter;

@Getter
public enum User {
    User1("beusafksdfsxfkhepp@kvhrs.com", "TestUser");
    private final String email;
    private final String password;
    private final String userName;

    User(String email, String userName) {
        final String passwordName = "password";
        this.email = email;
        this.userName = userName;
        this.password = System.getenv(passwordName) == null
                ? System.getProperty(passwordName)
                : System.getenv(passwordName);
        if (this.password == null) {
            throw new NullPointerException("User password was not set!");
        }
    }
}
