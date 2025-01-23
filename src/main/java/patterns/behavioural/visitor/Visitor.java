package patterns.behavioural.visitor;

import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk2;

public interface Visitor {
  void visit(Orbiter orbiter);

  void visit(OrbiterMk2 orbiter);
}