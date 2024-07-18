package ru.alina.creditbroker.repository.impl;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import ru.alina.creditbroker.jooq.public_.tables.records.ClientsRecord;
import ru.alina.creditbroker.repository.ClientRepository;

import static ru.alina.creditbroker.jooq.public_.Tables.CLIENTS;

@Repository
public class ClientRepositoryImpl implements ClientRepository {
    private final DSLContext dsl;

    public ClientRepositoryImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public ClientsRecord getByPassportNumber(String passportNumber) {
        return dsl.selectFrom(CLIENTS)
                .where(CLIENTS.PASSPORT_NUMBER.eq(passportNumber))
                .fetchAny();
    }
}
