package ru.alina.creditbroker.converter;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;
import ru.alina.creditbroker.domain.Client;
import ru.alina.creditbroker.jooq.public_.tables.records.ClientsRecord;

@Component
public class ClientConverter implements Converter<ClientsRecord, Client> {


    @Override
    public Client convert(MappingContext<ClientsRecord, Client> mappingContext) {
        ClientsRecord clientsRecord = mappingContext.getSource();
        return new Client(clientsRecord.getFirstName(), clientsRecord.getSurname(), clientsRecord.getSecondName(), clientsRecord.getPassportSeries(), clientsRecord.getPassportNumber());
    }
}
