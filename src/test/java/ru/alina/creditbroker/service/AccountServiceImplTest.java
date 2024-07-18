package ru.alina.creditbroker.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.alina.creditbroker.ClientData;

class AccountServiceImplTest extends ServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    void isClientHasSalaryAccount_true() {
        Assertions.assertTrue(accountService.isClientHasSalaryAccount(ClientData.CLIENT_ID_1));
    }

    @Test
    void isClientHasSalaryAccount_false() {
        Assertions.assertFalse(accountService.isClientHasSalaryAccount(ClientData.CLIENT_ID_3));
    }

    @Test
    void clientDoesNotExist() {
        Assertions.assertFalse(accountService.isClientHasSalaryAccount(100L));
    }
}