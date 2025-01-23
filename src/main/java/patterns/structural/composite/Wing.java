package patterns.structural.composite;

import patterns.creational.prototype.Orbiter;
import patterns.structural.bridge.Rover;

import java.util.List;

abstract class Wing implements Member {

  protected List<Rover> rovers;

  protected Wing(List<Rover> rovers) {
    this.rovers = rovers;
  }
}
