package pl.kostrzynski.modulith.secure;

import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @ApplicationModuleListener
    void listener(Event event) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(event);
    }

}
