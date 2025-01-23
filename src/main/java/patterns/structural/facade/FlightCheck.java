package patterns.structural.facade;

import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightCheck {
  private final AltitudeMonitor altitudeMonitor;
  private final ThrustVectoring thrustVectoring;

  public FlightCheck() {
    this.altitudeMonitor = new AltitudeMonitor();
    this.thrustVectoring = new ThrustVectoring();
  }

  public List<String> verify() {
    return List.of(
        altitudeMonitor.verify(),
        thrustVectoring.verify());
  }

  public void launch() {
    altitudeMonitor.activate();
    thrustVectoring.launch();
  }
}