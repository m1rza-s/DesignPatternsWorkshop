package patterns.structural.composite;

import java.util.List;
import patterns.creational.prototype.Orbiter;

abstract class Wing implements Member {

  protected List<Orbiter> orbiters;

  protected Wing(List<Orbiter> orbiters) {
    this.orbiters = orbiters;
  }
}