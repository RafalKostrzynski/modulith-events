package pl.kostrzynski.modulith.standard;

import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener {

    @ApplicationModuleListener
    void listener(Event event) {

        System.out.println(event);
    }

}
