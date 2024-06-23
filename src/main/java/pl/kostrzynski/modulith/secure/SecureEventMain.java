package pl.kostrzynski.modulith.secure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SecureEventMain {

    public static void main(String[] args) {
        SpringApplication.run(SecureEventMain.class, args);
    }

}
