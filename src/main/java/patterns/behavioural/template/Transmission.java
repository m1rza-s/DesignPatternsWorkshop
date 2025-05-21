package patterns.behavioural.template;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.state.BasicAntenna;

@Slf4j
public abstract class Transmission {

  protected final BasicAntenna antenna = new BasicAntenna();

  public Transmission() {
  }

  public void startProcedure() {
    powerOn();
    transmit();
    powerOff();
  }

  private void powerOn() {
    antenna.powerOn();
  }

  protected abstract void transmit();

  private void powerOff() {
    antenna.powerOff();
  }
}