package patterns.creational.factory;

import space.Planet;

class MarsLander extends Lander {

  @Override
  public Planet getPlanet() {
    return Planet.MARS;
  }
}
