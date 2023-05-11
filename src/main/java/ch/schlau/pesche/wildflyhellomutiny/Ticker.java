package ch.schlau.pesche.wildflyhellomutiny;

import java.time.Duration;

import org.eclipse.microprofile.reactive.messaging.Outgoing;

import io.smallrye.mutiny.Multi;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Ticker {

    @Outgoing("to-kafka")
    public Multi<String> generate() {
        return Multi
                .createFrom().ticks()
                .startingAfter(Duration.ofSeconds(5L))
                .every(Duration.ofSeconds(1L))
                .onItem().transform(i -> Long.toString(i));
    }
}
