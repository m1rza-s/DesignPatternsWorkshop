package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.structural.bridge.Rover;
import space.Planet;

class BridgeTest {

  /**
   * BRIDGE PATTERN replaces inheritance with object composition to decouple abstraction from
   * implementation.
   *
   * @param planet the planet to explore
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void bridgePattern(Planet planet) {
    var landerOrbiter = new Rover(planet);
    assertThatCode(() -> landerOrbiter.doRove(planet)).doesNotThrowAnyException();
  }
}
