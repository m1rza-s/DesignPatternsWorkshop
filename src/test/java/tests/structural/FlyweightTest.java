package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.structural.flyweight.OrbiterFlyweight;
import space.Planet;

/**
 * FLYWEIGHT PATTERN
 *
 * <p>Purpose: Minimizes memory usage by sharing a common state between multiple objects instead of
 * duplicating data.
 *
 * <p>When to use:
 *
 * <ul>
 *   <li>When you need to support a large number of similar objects
 *   <li>When memory usage is a concern
 *   <li>When object state can be divided into intrinsic and extrinsic parts
 * </ul>
 *
 * <p>Common Pitfalls:
 *
 * <ul>
 *   <li>Premature optimization
 *   <li>Not properly separating intrinsic and extrinsic state
 * </ul>
 */
public class FlyweightTest {

  /**
   * When exploring space, we must be very careful with our resources. However, space is the great
   * unknown, so we don't exactly know what to expect. We need to be able to adapt to potentially
   * repeating situations and create orbiters on demand.
   *
   * <p>Use the flyweight pattern to create and store orbiters for various missions.
   *
   * @param planet to orbit
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void example(Planet planet) {
    missionBacklog().forEach(mission -> OrbiterFlyweight.getOrCreate(mission).doOrbit(planet));
    assertThat(OrbiterFlyweight.countOrbiters()).isEqualTo(6);
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  create a new Flyweight class that creates 3 types of DedicatedOrbiters: pole, orbit, other
     * */
  }

  private List<String> missionBacklog() {
    return List.of(
        "equator",
        "moon",
        "northPole",
        "highOrbit",
        "southPole",
        "lowOrbit",
        "highOrbit",
        "equator",
        "moon",
        "northPole",
        "southPole",
        "lowOrbit",
        "northPole",
        "highOrbit",
        "lowOrbit",
        "moon",
        "southPole",
        "equator",
        "southPole",
        "lowOrbit",
        "moon",
        "northPole",
        "highOrbit",
        "equator",
        "moon",
        "equator",
        "southPole",
        "lowOrbit",
        "highOrbit",
        "northPole",
        "lowOrbit",
        "moon",
        "northPole",
        "southPole",
        "equator",
        "highOrbit",
        "equator",
        "northPole",
        "highOrbit",
        "southPole",
        "lowOrbit",
        "moon",
        "moon",
        "southPole",
        "equator",
        "highOrbit",
        "northPole",
        "lowOrbit"
        // ...
        );
  }
}