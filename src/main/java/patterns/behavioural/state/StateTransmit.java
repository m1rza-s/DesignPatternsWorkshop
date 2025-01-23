package patterns.behavioural.state;

import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.builder.Message;
import patterns.creational.singleton.MissionControl;

@Slf4j
public class StateTransmit extends State {

  public StateTransmit(BasicAntenna antenna) {
    super(antenna);
  }

  @Override
  void start() {
    throw new UnsupportedOperationException("Cannot start when system is transmitting");
  }

  @Override
  void transmit(UUID channel) {
    log.info("{} is transmitting", antenna);
    MissionControl.contact()
        .getMessages()
        .add(
            new Message.Builder()
                .title("%d".formatted(System.currentTimeMillis()))
                .content("Transmitting data to channel %s".formatted(channel))
                .build());
  }

  @Override
  void stop() {
    antenna.setState(new StateOff(antenna));
    antenna.powerOff();
  }
}