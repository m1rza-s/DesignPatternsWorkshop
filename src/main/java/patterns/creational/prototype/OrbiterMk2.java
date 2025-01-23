package patterns.creational.prototype;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.visitor.Visitor;
import space.Planet;

@Getter
@Slf4j
public class OrbiterMk2 extends Orbiter {

  @Override
  public void doOrbit(Planet planet) {
    log.info("{} orbits planet {}.", this, planet);
  }

  @Override
  public void consumeCommand(Visitor visitor) {
    log.info("{} is performing special preparations...", this);
    visitor.visit(this);
  }
}