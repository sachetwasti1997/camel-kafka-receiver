package com.camel.receiver_micro_service.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageReceiverRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("kafka:camel-topic")
                .log("${body}");
    }
}
