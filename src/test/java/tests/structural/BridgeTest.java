package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.creational.factory.Lander;
import patterns.structural.bridge.Bridge;
import patterns.structural.bridge.LanderBridge;
import space.Planet;

/**
 * BRIDGE PATTERN
 *
 * <p>Purpose: Separates abstraction from implementation, enabling independent development of both.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to avoid a permanent binding between abstraction and implementation</li>
 *   <li>When both abstraction and implementation should be extensible</li>
 *   <li>When changes in implementation shouldn't affect the client</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Overcomplicating simple relationships</li>
 *   <li>Confusing with the Adapter pattern</li>
 * </ul>
 */
class BridgeTest {

  /**
   * We have the technology to approach and land on different planets. We want to reuse existing
   * technology to also rove on the planet's surface.
   *
   * <p>Use the bridge pattern to separate the rover's abstraction from its implementation.
   *
   * @param planet to land on
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void example(Planet planet) {
    Bridge bridge = new LanderBridge(Lander.Factory.create(planet));

    assertThatCode(() -> bridge.act(planet)).doesNotThrowAnyException();
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  we need to be able to control an Orbiter and a Lander at the same time
     *  create a bridge class that can control both a Lander and an Orbiter
     * */
  }
}