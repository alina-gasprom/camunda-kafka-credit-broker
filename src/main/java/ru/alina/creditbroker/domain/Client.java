package ru.alina.creditbroker.domain;

import java.util.Objects;

public class Client {
    private String username;
    private String surname;
    private String secondName;
    private String passportSeries;
    private String passportNumber;

    private Client() {
    }

    public Client(String username, String surname, String secondName, String passportSeries, String passportNumber) {
        this.username = username;
        this.surname = surname;
        this.secondName = secondName;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(username, client.username) && Objects.equals(surname, client.surname) && Objects.equals(secondName, client.secondName) && Objects.equals(passportSeries, client.passportSeries) && Objects.equals(passportNumber, client.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, surname, secondName, passportSeries, passportNumber);
    }

    @Override
    public String toString() {
        return "Client{" +
                "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
