package ru.alina.creditbroker.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.alina.creditbroker.dto.UserDto;
import ru.alina.creditbroker.service.impl.CamundaService;


@Component
public class MessageConsumer {
    private final static String MESSAGE_START = "StartProcess";
    private final static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
    private final CamundaService camundaService;

    public MessageConsumer(CamundaService camundaService) {
        this.camundaService = camundaService;
    }

    @KafkaListener(topics = "credit")
    public void startProcess(UserDto userDto) {
        logger.debug("start process topic");
        logger.debug("Received message from kafka {}", userDto);
        camundaService.correlate(userDto, MESSAGE_START);

    }
}
