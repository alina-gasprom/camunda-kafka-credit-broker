package ru.alina.creditbroker.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.alina.creditbroker.ClientData;


public class ClientServiceImplTest extends ServiceTest {

    @Autowired
    ClientService clientService;

    @Test
    @Transactional
    void isUserClient() {
        Assertions.assertTrue(clientService.isClientExist(ClientData.USER_EXIST));
    }

    @Test
    @Transactional
    void isUserClient_ClientNotExist() {
        Assertions.assertFalse(clientService.isClientExist(ClientData.USER_NOT_EXIST));
    }

}
