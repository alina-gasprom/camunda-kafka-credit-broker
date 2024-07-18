package ru.alina.creditbroker.entity;

public class ClientEntity {
    private final String username;
    private final String surname;
    private final String secondName;
    private final String passportSeries;
    private final String passportNumber;

    public ClientEntity(String username, String surname, String secondName, String passportSeries, String passportNumber) {
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
    public String toString() {
        return "ClientEntity{" +
                "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
