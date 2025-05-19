package tests.creational;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.creational.factory.Lander;
import space.Planet;

/**
 * FACTORY PATTERN
 *
 * <p>Purpose: Centralizes object creation, making it easier to introduce new types without modifying existing code.
 *
 * <p>When to use:
 * <ul>
 *   <li>When the exact object type your code needs isn't known in advance</li>
 *   <li>When you want to decouple object creation from its usage</li>
 *   <li>When you need to create objects based on certain conditions</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating overly complex factories</li>
 *   <li>Not properly maintaining the factory when new types are added</li>
 * </ul>
 */
class FactoryTest {

  /**
   * We need {@link Lander} for different planet types. The lander itself must be decoupled from the
   * planet. Use the factory pattern to create the appropriate lander for the given planet type.
   *
   */
  @Test
  void example() {
    var lander = Lander.Factory.create(Planet.SATURN);
    assertThat(lander ).isNotNull();
    assertThatCode(() -> lander.doLand(Planet.SATURN)).doesNotThrowAnyException();
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