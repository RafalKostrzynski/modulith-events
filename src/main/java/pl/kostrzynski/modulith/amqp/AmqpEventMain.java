package pl.kostrzynski.modulith.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class AmqpEventMain {

    public static void main(String[] args) {
        SpringApplication.run(AmqpEventMain.class, args);
    }

}
