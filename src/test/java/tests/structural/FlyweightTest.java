package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.structural.flyweight.OrbiterCache;
import space.Planet;

/**
 * FLYWEIGHT PATTERN is a structural design pattern that aims to minimize memory usage or
 * computational expenses by sharing as much data as possible with other similar objects.
 */
public class FlyweightTest {

  /**
   * When exploring space, we must be very careful with our resources. However, space is the great
   * unknown so we don't exactly know what to expect. We need to be able to adapt to potentially repeating situations
   * and create orbiters on demand.
   *
   * <p>Use the flyweight pattern to create and store orbiters for various missions.
   *
   * @param planet to orbit
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void flyweightPattern(Planet planet) {
    unforeseeableMissions().forEach(mission -> OrbiterCache.getOrCreate(mission).doOrbit(planet));

    OrbiterCache.getOrCreate("dive").doOrbit(planet);
    assertThat(OrbiterCache.countOrbiters()).isEqualTo(7);
  }

  private List<String> unforeseeableMissions() {
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
        "lowOrbit");
  }
}