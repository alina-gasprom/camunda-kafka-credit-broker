package ru.alina.creditbroker.repository;

import ru.alina.creditbroker.jooq.public_.tables.records.ClientsRecord;

public interface ClientRepository {
    ClientsRecord getByPassportNumber(String passportNumber);
}
