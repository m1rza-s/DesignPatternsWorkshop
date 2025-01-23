package tests.creational;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.creational.factory.Lander;
import space.Planet;

/**
 * FACTORY PATTERN centralizes object creation, making it easier to introduce new types without
 * modifying existing code. It’s ideal when the exact object type your code needs isn’t known in
 * advance. This pattern decouples product construction from the main logic, ensuring code remains
 * extensible and easier to maintain.
 */
class FactoryTest {

  /**
   * We need {@link Lander} for different planet types. The lander itself must be decoupled from the
   * planet. Use the factory pattern to create the appropriate lander for the given planet type.
   *
   * @param planet the condition by which the object is created
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void factoryPattern(Planet planet) {
    var lander = Lander.Factory.create(planet);

    assertThatCode(() -> lander.doLand(planet)).doesNotThrowAnyException();
  }

  /**
   * Object factories are easily expandable with new types
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  @Disabled
  void todo(Planet planet) {
    /*
     * todo:
     *  some planets have very strong gravity
     *  expand the create method in the Lander.Factory to create StrongLanders for planets with a strong gravity
     * */
  }
}