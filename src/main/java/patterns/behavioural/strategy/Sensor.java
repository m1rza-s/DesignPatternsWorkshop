package patterns.behavioural.strategy;

import lombok.Setter;
import space.Planet;

@Setter
public class Sensor {

  private Strategy strategy;

  public void analyze(Planet planet) {
    strategy.loadTelemetry(planet);
    strategy.doAnalysis(planet);
    strategy.prepareReport(planet);
  }
}