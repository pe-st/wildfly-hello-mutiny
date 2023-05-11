package ch.schlau.pesche.wildflyhellomutiny;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Listener {

    @Incoming("from-kafka")
    public void receive(String feed) {
        System.out.printf("Hello Wildfly from Mutiny Ticker %s%n", feed);
    }
}
