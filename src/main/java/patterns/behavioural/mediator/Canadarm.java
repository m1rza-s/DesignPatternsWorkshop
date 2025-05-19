package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Canadarm {

    void etendre() {
        log.info("Le Canadarm s’étend.");
    }

    void contracter() {
        log.info("Le Canadarm se rétracte.");
    }

    void attraper() {
        log.info("Le Canadarm saisit.");
    }

}