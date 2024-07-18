package ru.alina.creditbroker.repository;

import ru.alina.creditbroker.jooq.public_.tables.records.AccountsRecord;

import java.util.List;

public interface AccountRepository {
    List<AccountsRecord> getSalaryAccountByUserId(Long clientId);
}
