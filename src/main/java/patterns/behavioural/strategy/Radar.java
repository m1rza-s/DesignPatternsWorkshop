package patterns.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public class Radar extends Strategy {

  @Override
  public void doAnalysis(Planet planet) {
    log.info("RADAR analysis of {} in progress...", planet);
  }
}