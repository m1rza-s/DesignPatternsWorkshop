package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk1;
import patterns.creational.prototype.OrbiterMk2;
import space.Planet;

/**
 * PROTOTYPE PATTERN
 *
 * <p>Purpose: Creates object copies without depending on specific classes, reducing repeated initialization code.
 *
 * <p>When to use:
 * <ul>
 *   <li>When the cost of creating an object is expensive</li>
 *   <li>When you need to create objects similar to existing ones</li>
 *   <li>When you want to hide the complexity of object creation</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Not handling complex object graphs properly</li>
 *   <li>Forgetting to reset unique attributes after cloning</li>
 * </ul>
 */
@Slf4j
class PrototypeTest {

  private static List<Orbiter> getOrbiters() {
    return List.of(
        new OrbiterMk1(),
        new OrbiterMk2(),

        new Orbiter() { // Anonymous class to demonstrate unforeseeable future orbiters
          @Override
          public void doOrbit(Planet planet) {
            log.info("ExperimentalOrbiterMkX orbits planet {}.", planet);
          }
        });
  }

  /**
   * In space, we need to be very careful with our resources. To explore the solar system, we need
   * many different types of {@link Orbiter}s. We can't afford to waste time on assembling each orbiter from
   * scratch. Use the prototype pattern to create copies of orbiters.
   */
  @Test
  void example() {
    Orbiter initialOrbiter = new OrbiterMk1();
    Orbiter clone = initialOrbiter.clone();

    assertThat(clone).isNotEqualTo(initialOrbiter);
    assertThat(clone.getChannel()).isEqualTo(initialOrbiter.getChannel());
    assertThatCode(() -> clone.doOrbit(Planet.MARS)).doesNotThrowAnyException();
  }

  @ParameterizedTest
  @MethodSource("getOrbiters")
  @Disabled
  void todo(Orbiter initialOrbiter) {
    /*
     * todo:
     *  create a new type of Orbiter and add it to the list below
     *  verify that any type of Orbiter can be cloned without depending on its specific class
     * */
  }
}