package patterns.behavioural.responsabilitychain;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public class GravityCheck extends Chain {

  @Override
  public boolean doCheck(Planet planet) {
    if (planet.getRelativeGravity() > Planet.EARTH.getRelativeGravity()) {
        log.warn("Gravity check failed for planet {}", planet);
      return false;
    }
    log.info("Gravity check passed for planet {}", planet);
    return nextCheck(planet);
  }
}