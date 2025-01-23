package patterns.behavioural.visitor;

import lombok.extern.slf4j.Slf4j;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk2;
import space.Planet;

@Slf4j
public class OrbitVisitor implements Visitor {

  private final Planet planet;

  public OrbitVisitor(Planet planet) {
    this.planet = planet;
  }

  @Override
  public void visit(Orbiter orbiter) {
    orbiter.doOrbit(planet);
  }

  @Override
  public void visit(OrbiterMk2 orbiter) {
    orbiter.doOrbit(planet);
  }
}