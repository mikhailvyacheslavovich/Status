package ru.inobitec.status.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.inobitec.status.service.StatusService;

@Component
public class Receiver {

    @Autowired
    private StatusService statusService;

    @RabbitListener(queues = "MessageQueue")
    public void getMsg(final String message) {
        System.out.println(message);

        if (message.equals("Change status")) {
            statusService.changeStatus();
        }
    }
}