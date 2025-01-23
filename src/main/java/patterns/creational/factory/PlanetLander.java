package patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

import java.util.stream.Stream;

@Slf4j
class PlanetLander extends Lander {

  public void doLand(Planet planet) {
    if (Stream.of(Planet.values()).filter(Planet::isGasGiant).noneMatch(planet::equals)) {
      log.info("{} is landing on {}", this, planet);
      return;
    }
    throw new IllegalArgumentException("%s cannot land on %s!".formatted(this, planet));
  }
}