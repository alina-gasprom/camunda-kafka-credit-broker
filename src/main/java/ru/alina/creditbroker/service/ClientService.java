package ru.alina.creditbroker.service;

import ru.alina.creditbroker.dto.UserDto;

public interface ClientService {

    boolean isClientExist(UserDto userDto);
}
