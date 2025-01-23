package patterns.behavioural.state;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateOff extends State {

  public StateOff(BasicAntenna antenna) {
    super(antenna);
  }

  @Override
  void start() {
    antenna.setState(new StateOn(antenna));
    antenna.powerOn();
  }

  @Override
  void transmit(UUID channel) {
    throw new UnsupportedOperationException("Cannot transmit when system is off");
  }

  @Override
  void stop() {
    log.info("{} is off", antenna);
  }
}