package ru.inobitec.status.rabbit;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.inobitec.status.service.StatusService;

@Component
@RequiredArgsConstructor
public class Receiver {

    private final StatusService statusService;

    @RabbitListener(queues = "MessageQueue")
    public void getMsg(String message) {
        statusService.changeStatus(message);
    }
}
