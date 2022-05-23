package com.greencity.auto.constants;

public enum User {
    User1("exekffhvlayggqvtca@kvhrr.com");

    private final String userName;
    private final String password;

    User(String userName) {
        final String passwordName = "password";
        this.userName = userName;
        this.password = System.getenv(passwordName) == null
                ? System.getProperty(passwordName)
                : System.getenv(passwordName);
        if (this.password == null) {
            throw new NullPointerException("User password was not set!");
        }
    }
}
