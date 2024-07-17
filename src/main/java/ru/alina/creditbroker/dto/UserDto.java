package ru.alina.creditbroker.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDto {
    private final String username;
    private final String surname;
    private final String secondName;
    private final String passportSeries;
    private final String passportNumber;


    @JsonCreator
    public UserDto(@JsonProperty("username") String username,
                   @JsonProperty("surname")String surname,
                   @JsonProperty("secondName")String secondName,
                   @JsonProperty("passportSeries")String passportSeries,
                   @JsonProperty("passportNumber")String passportNumber) {
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
        return "UserDto{" +
                "username='" + username + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", passportSeries='" + passportSeries + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
