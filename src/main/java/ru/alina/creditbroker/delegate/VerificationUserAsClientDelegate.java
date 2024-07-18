package ru.alina.creditbroker.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.alina.creditbroker.dto.UserDto;
import ru.alina.creditbroker.service.ClientService;
import ru.alina.creditbroker.util.JsonUtil;

@Component
public class VerificationUserAsClientDelegate implements JavaDelegate {
    private final static Logger log = LoggerFactory.getLogger(VerificationUserAsClientDelegate.class);
    private final ClientService clientService;

    public VerificationUserAsClientDelegate(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) {
        UserDto userDto = JsonUtil.stringToObject(delegateExecution.getVariable("client").toString(), UserDto.class);
        boolean isUserClient = clientService.isClientExist(userDto);
        delegateExecution.setVariable("isUserClient", isUserClient);
        log.debug("camunda delegate {} execution, set variable isUserClient - {}", delegateExecution.getId(), isUserClient);
    }
}
