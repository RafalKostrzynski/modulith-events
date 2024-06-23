package pl.kostrzynski.modulith.amqp;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    @GetMapping
    @Transactional
    public void publish() {

        this.applicationEventPublisher.publishEvent(new Event( "my-rabbit","Triggered"));
    }

}
