package patterns.creational.prototype;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Getter
@Slf4j
public class OrbiterMk1 extends Orbiter {

  @Override
  public void doOrbit(Planet planet) {
    log.info("{} orbits planet {}.", this, planet);
  }
}