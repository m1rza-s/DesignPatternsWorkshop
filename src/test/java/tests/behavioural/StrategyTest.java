package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.behavioural.strategy.Lidar;
import patterns.behavioural.strategy.Radar;
import patterns.behavioural.strategy.Sensor;
import space.Planet;

/**
 * STRATEGY PATTERN defines interchangeable behaviors, each in a separate class, allowing easy
 * replacement and extension at runtime while following SOLID principles.
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
  void strategyPattern(Planet planet) {
    var sensor = new Sensor();

    if (planet.getMaxTempKelvin() > 150) {
      sensor.setStrategy(new Radar());
    } else {
      sensor.setStrategy(new Lidar());
    }
    assertThatCode(() -> sensor.analyze(planet)).doesNotThrowAnyException();
  }

  @Test
  void todo() {
    /*
     * todo:
     *  rings represent a hazard to orbiters
     *  create a visual strategy for planets with rings
     * */
  }
}