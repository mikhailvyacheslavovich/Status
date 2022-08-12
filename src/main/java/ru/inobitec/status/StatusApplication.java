package ru.inobitec.status;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class StatusApplication {

    public static void main(String[] args) {
        SpringApplication.run(StatusApplication.class, args);
    }

}
