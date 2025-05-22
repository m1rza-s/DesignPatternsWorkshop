package patterns.behavioural.template;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.singleton.MissionControl;

@Slf4j
public class BasicTransmission extends TransmissionTemplate {

  @Override
  protected void transmit() {
    antenna.transmit(MissionControl.contact().getChannel());
  }
}