package patterns.behavioural.state;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StateOn extends State {

  public StateOn(BasicAntenna antenna) {
    super(antenna);
  }

  @Override
  void start() {
    log.info("{} is on", antenna);
  }

  @Override
  void transmit(UUID channel) {
    antenna.setState(new StateTransmit(antenna));
    antenna.transmit(channel);
  }

  @Override
  void stop() {
    antenna.setState(new StateOff(antenna));
    antenna.powerOff();
  }
}