package com.santiago845.screenplay.model;

public class SwagLabsAccount {
    private final String username;
    private final String password;

    public SwagLabsAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String name() {
        return username;
    }

    public String password() {
        return password;
    }
}
