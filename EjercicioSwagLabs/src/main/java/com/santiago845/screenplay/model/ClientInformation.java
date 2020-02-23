package com.santiago845.screenplay.model;

public class ClientInformation {

    private final String firstName;
    private final String lastName;
    private final String zipPostalCode;

    public ClientInformation(String firstName, String lastName, String zipPostalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipPostalCode = zipPostalCode;
    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String zipPostalCode() {
        return zipPostalCode;
    }

}
