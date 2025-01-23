package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk1;
import space.Planet;

class PrototypeTest {

  /**
   * PROTOTYPE PATTERN lets us copy objects without making the code dependent on the initialisation
   * logic.
   */
  @Test
  void prototypePattern() {
    var initialOrbiter = new OrbiterMk1(1);
    List<Orbiter> orbiters = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      orbiters.add(initialOrbiter.clone(i));
    }

    assertThat(orbiters)
        .allMatch(orbiter -> orbiter.getChannel().equals(initialOrbiter.getChannel()))
        .noneMatch(orbiter -> orbiter.equals(initialOrbiter));

    orbiters.forEach(orbiter -> orbiter.doOrbit(Planet.SATURN));
  }
}
