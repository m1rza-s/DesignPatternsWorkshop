package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.behavioural.strategy.Lidar;
import patterns.behavioural.strategy.Radar;
import patterns.behavioural.strategy.Sensor;
import space.Planet;

/**
 * STRATEGY PATTERN
 *
 * <p>Purpose: Defines a family of interchangeable algorithms that can be switched at runtime.
 *
 * <p>When to use:
 *
 * <ul>
 *   <li>When you want to define a family of algorithms
 *   <li>When you need different variants of an algorithm
 *   <li>When you want to avoid exposing algorithm-specific data structures
 * </ul>
 *
 * <p>Common Pitfalls:
 *
 * <ul>
 *   <li>Creating strategies for simple algorithms
 *   <li>Not properly handling strategy parameters
 * </ul>
 */
class StrategyTest {

  /**
   * Our mission requires a sensor to analyze the surface of each planet. The sensor must use a
   * radar to analyze planets with a max temperature above 150 Kelvin and a lidar for the rest.
   *
   * @param planet to analyze
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void example(Planet planet) {
    var sensor = new Sensor();

    if (planet.getMaxTempKelvin() > 150) {
      sensor.setStrategy(new Radar());
    } else {
      sensor.setStrategy(new Lidar());
    }
    assertThatCode(() -> sensor.analyze(planet)).doesNotThrowAnyException();
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  rings represent a hazard to orbiters
     *  create a new strategy for planets with rings
     *  create a special strategy just for Earth
     * */
  }
}