package ru.alina.creditbroker.service.impl;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.MessageCorrelationBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.alina.creditbroker.dto.UserDto;
import ru.alina.creditbroker.service.BPMNService;
import ru.alina.creditbroker.util.JsonUtil;

@Service
public class CamundaService implements BPMNService {
    private final static Logger logger = LoggerFactory.getLogger(CamundaService.class);
    private final RuntimeService runtimeService;

    public CamundaService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Override
    public void correlate(UserDto userDto, String message) {

        MessageCorrelationBuilder builder = runtimeService.createMessageCorrelation(message);
        String userJson = JsonUtil.objectToString(userDto);
        builder.setVariable("client", userJson);
        logger.debug("Executing camunda task... ");
        builder.correlate();
    }
}
