package patterns.behavioural.state;

import java.util.UUID;

abstract class State {

  protected final BasicAntenna antenna;

  public State(BasicAntenna antenna) {
        this.antenna = antenna;
    }

    abstract void start();

  abstract void transmit(UUID channel);

    abstract void stop();
}