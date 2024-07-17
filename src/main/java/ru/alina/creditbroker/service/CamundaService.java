package ru.alina.creditbroker.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.alina.creditbroker.dto.UserDto;

@Service
public class CamundaService {
    private final static Logger logger = LoggerFactory.getLogger(CamundaService.class);
    private final RuntimeService runtimeService;
    private final ObjectMapper objectMapper;

    public CamundaService(RuntimeService runtimeService, ObjectMapper objectMapper) {
        this.runtimeService = runtimeService;
        this.objectMapper = objectMapper;
    }

    public void correlate(UserDto userDto, String message) {

        MessageCorrelationBuilder builder = runtimeService.createMessageCorrelation(message);
        String userJson = null;
        try {
            userJson = objectMapper.writeValueAsString(userDto);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        builder.setVariable("client", userJson);
        logger.debug("Executing camunda task... ");
        builder.correlate();

    }
}
