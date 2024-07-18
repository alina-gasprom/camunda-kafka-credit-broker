package ru.alina.creditbroker.service;

import ru.alina.creditbroker.dto.UserDto;

public interface BPMNService {
    void correlate(UserDto userDto, String message);
}
