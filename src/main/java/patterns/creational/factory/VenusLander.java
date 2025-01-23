package patterns.creational.factory;

import space.Planet;

class VenusLander extends Lander {

  @Override
  public Planet getPlanet() {
    return Planet.VENUS;
  }
}
