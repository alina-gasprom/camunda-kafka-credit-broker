package ru.alina.creditbroker.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ru.alina.creditbroker.domain.Client;
import ru.alina.creditbroker.dto.UserDto;
import ru.alina.creditbroker.jooq.public_.tables.records.ClientsRecord;
import ru.alina.creditbroker.repository.ClientRepository;
import ru.alina.creditbroker.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ModelMapper modelMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
    }

    public boolean isClientExist(UserDto userDto) {
        ClientsRecord clientResult = clientRepository.getByPassportNumber(userDto.getPassportNumber());
        if (clientResult == null) return false;
        Client clientFromDB = modelMapper.map(clientResult, Client.class);
        Client requestedClient = modelMapper.map(userDto, Client.class);
        return clientFromDB.equals(requestedClient);
    }
}
