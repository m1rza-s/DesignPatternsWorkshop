package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Canadarm {

    void etendre() {
        log.info("Extending...");
    }

    void contracter() {
        log.info("Contracting...");
    }

    void attraper() {
        log.info("Grabbing...");
    }

}