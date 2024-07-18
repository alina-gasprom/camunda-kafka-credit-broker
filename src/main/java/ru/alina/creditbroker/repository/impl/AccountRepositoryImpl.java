package ru.alina.creditbroker.repository.impl;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import ru.alina.creditbroker.domain.AccountType;
import ru.alina.creditbroker.jooq.public_.tables.records.AccountsRecord;
import ru.alina.creditbroker.repository.AccountRepository;

import java.util.List;

import static ru.alina.creditbroker.jooq.public_.Tables.ACCOUNTS;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    private final DSLContext dsl;

    public AccountRepositoryImpl(DSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public List<AccountsRecord> getSalaryAccountByUserId(Long clientId) {
        return dsl.selectFrom(ACCOUNTS).where(ACCOUNTS.CLIENT_ID.eq(clientId).and(ACCOUNTS.ACCOUNT_TYPE.ge(String.valueOf(AccountType.SALARY)))).fetchInto(AccountsRecord.class);
    }
}
