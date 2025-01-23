package patterns.behavioural.responsabilitychain;

import space.Planet;

public class TempCheck extends Chain {

  @Override
  public boolean doCheck(Planet planet) {
    if (planet.getMaxTempKelvin() > Planet.EARTH.getMaxTempKelvin()) {
      return false;
    }
    return nextCheck(planet);
  }
}