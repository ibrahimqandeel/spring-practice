package code.practice.messaging.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "activeMQ-queue")
    public void listener(String message) {
        logger.info("Message received {} ", message);
    }

    @JmsListener(destination = "activeMQ-queue2")
    public void listener2(String message) {
        logger.info("Message received {} ", message);
    }

    @JmsListener(destination = "activeMQ-topic")
    public void listener3(String message) {
        logger.info("Message received {} ", message);
    }

    @JmsListener(destination = "activeMQ-topic")
    public void listener4(String message) {
        logger.info("Message received {} ", message);
    }
}
