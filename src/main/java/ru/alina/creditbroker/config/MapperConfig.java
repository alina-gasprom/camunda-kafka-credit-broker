package ru.alina.creditbroker.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alina.creditbroker.converter.ClientConverter;

@Configuration
public class MapperConfig {
    private final ClientConverter clientConverter;

    public MapperConfig(ClientConverter clientConverter) {
        this.clientConverter = clientConverter;
    }

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();

    }

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);

        mapper.addConverter(clientConverter);

        return mapper;
    }
}
