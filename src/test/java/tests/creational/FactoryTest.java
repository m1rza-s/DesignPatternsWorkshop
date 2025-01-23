package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import space.Planet;
import patterns.creational.factory.Lander;

class FactoryTest {

  /**
   * FACTORY PATTERN can be used to create objects without exposing the instantiation logic.
   *
   * @param planet the condition by which the object is created
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void factoryPattern(Planet planet) {
    var lander = Lander.Factory.create(planet);

    assertThat(lander)
        .isNotNull()
        .isInstanceOf(Lander.class)
        .extracting(Lander::getPlanet)
        .isEqualTo(planet);
    assertThatCode(() -> lander.doLand(planet)).doesNotThrowAnyException();
  }
}
