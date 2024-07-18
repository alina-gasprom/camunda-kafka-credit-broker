package ru.alina.creditbroker.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ru.alina.creditbroker.ClientData;
import ru.alina.creditbroker.service.impl.ClientServiceImpl;

public class ClientServiceImplTest extends ServiceTest {

    @Autowired
    private ClientServiceImpl clientService;

    @Test
    void isUserClient() {
        Assertions.assertTrue(clientService.isClientExist(ClientData.USER_EXIST));
    }

    @Test
    void isUserClient_ClientNotExist() {
        Assertions.assertFalse(clientService.isClientExist(ClientData.USER_NOT_EXIST));
    }

}
