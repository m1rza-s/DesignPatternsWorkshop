package patterns.behavioural.responsabilitychain;

import space.Planet;

public class GravityCheck extends Chain {

  @Override
  public boolean doCheck(Planet planet) {
    if (planet.getRelativeGravity() > Planet.EARTH.getRelativeGravity()) {
      return false;
    }
    return nextCheck(planet);
  }
}