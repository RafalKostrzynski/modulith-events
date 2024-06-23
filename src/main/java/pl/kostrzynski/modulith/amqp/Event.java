package pl.kostrzynski.modulith.amqp;

import org.springframework.modulith.events.Externalized;

@Externalized(target = AmqpConfiguration.QUEUE)
public record Event(String key, String topic) {

}
