package patterns.behavioural.state;

import java.util.UUID;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Slf4j
public class BasicAntenna {

  private State state;

  public BasicAntenna() {
    state = new StateOff(this);
  }

  public void powerOn() {
    state.start();
  }

  public void powerOff() {
    state.stop();
  }

  public void transmit(UUID channel) {
    state.transmit(channel);
  }
}