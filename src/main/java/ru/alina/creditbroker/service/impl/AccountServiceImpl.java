package ru.alina.creditbroker.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.alina.creditbroker.jooq.public_.tables.records.AccountsRecord;
import ru.alina.creditbroker.repository.AccountRepository;
import ru.alina.creditbroker.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    private final static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public boolean isClientHasSalaryAccount(Long clientId) {
        if (clientId == null) {
            throw new IllegalArgumentException("Client id is null");
        }
        List<AccountsRecord> accounts = accountRepository.getSalaryAccountByUserId(clientId);
        logger.debug("get salary account list: {} for client with id: {}", accounts, clientId);
        return !accounts.isEmpty();
    }
}
