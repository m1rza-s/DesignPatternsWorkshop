package patterns.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public abstract class Strategy {
  public void loadTelemetry(Planet planet) {
    log.info("Loading telemetry for {}...", planet);
  }

  public void prepareReport(Planet planet) {
    log.info("{} OK!", planet);
  }

  abstract void doAnalysis(Planet planet);
}