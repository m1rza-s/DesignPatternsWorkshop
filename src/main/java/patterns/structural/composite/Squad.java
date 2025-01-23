package patterns.structural.composite;

import java.util.List;
import patterns.creational.prototype.Orbiter;
import space.Planet;

public class Squad extends Wing {

  public Squad(List<Orbiter> orbiters) {
    super(orbiters);
    }

    @Override
    public void explore(Planet planet) {
    orbiters.forEach(orbiter -> orbiter.doOrbit(planet));
    }

    @Override
    public int count() {
    return orbiters.size();
    }
}