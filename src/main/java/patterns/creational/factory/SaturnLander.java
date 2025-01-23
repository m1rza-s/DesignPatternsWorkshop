package patterns.creational.factory;

import space.Planet;

class SaturnLander extends Lander {

  @Override
  public Planet getPlanet() {
    return Planet.SATURN;
  }
}
