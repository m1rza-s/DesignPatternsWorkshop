package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.structural.bridge.OpticalSensor;
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
   * We need to gather as much information as possible about a planet, but we don't know what to
   * expect. In an attempt to be ready, we have a very modular sensor system that can be easily
   * extended.
   *
   * <p>Use the Bridge pattern to create more sensors.
   */
  @Test
  void example() {
    var sensor = new OpticalSensor();

    assertThat(sensor.sense(Planet.SATURN))
        .isEqualTo("LowResolution OpticalSensor is analysing planet SATURN");
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  add a HighResolution
     *  upgrade the OpticalSensor class to use high resolution
     *  create a new Sensor
     * */
  }
}