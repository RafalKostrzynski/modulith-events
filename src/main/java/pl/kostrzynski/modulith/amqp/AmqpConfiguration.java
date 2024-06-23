package pl.kostrzynski.modulith.amqp;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfiguration {

    static final String QUEUE = "myfanout-queue";

    @Bean
    Binding binding(Queue queue, Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(QUEUE).noargs();
    }

    @Bean
    Exchange exchange() {
        return ExchangeBuilder.fanoutExchange(QUEUE).build();
    }

    @Bean
    Queue queue() {
        return QueueBuilder.durable(QUEUE).build();
    }

}
