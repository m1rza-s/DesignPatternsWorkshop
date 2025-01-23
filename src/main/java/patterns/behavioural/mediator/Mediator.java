package patterns.behavioural.mediator;

import patterns.creational.prototype.Orbiter;
import space.Planet;

public interface Mediator {

  void extend();

  void contract();

  void grab();

}