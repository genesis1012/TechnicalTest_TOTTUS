package com.test.automation.utils;

public enum RestService {

    BASE_URL("https://gorest.co.in/public-api"),
	CONSULT_USERS("/users?page=%d");

    private String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
