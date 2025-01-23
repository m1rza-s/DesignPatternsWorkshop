package patterns.behavioural.template;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.state.BasicAntenna;

@Slf4j
public abstract class Transmission {

  protected final List<BasicAntenna> antennas;

  public Transmission() {
    this.antennas = List.of(new BasicAntenna(), new BasicAntenna(), new BasicAntenna());
  }

  public void startProcedure() {
    powerOn();
    transmit();
    powerOff();
  }

  private void powerOn() {
    antennas.forEach(BasicAntenna::powerOn);
  }

  protected abstract void transmit();

  private void powerOff() {
    antennas.forEach(BasicAntenna::powerOff);
  }
}