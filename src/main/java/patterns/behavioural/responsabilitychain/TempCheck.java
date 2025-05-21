package patterns.behavioural.responsabilitychain;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public class TempCheck extends Chain {

  @Override
  public boolean doCheck(Planet planet) {
    if (planet.getMaxTempKelvin() > Planet.EARTH.getMaxTempKelvin()) {
      log.warn("Temperature check failed for planet {}", planet);
      return false;
    }
    log.info("Temperature check passed for planet {}", planet);
    return nextCheck(planet);
  }
}