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
 * PROTOTYPE PATTERN is used when creating object copies without depending on their specific
 * classes. It reduces repeated initialization code, saves resources[1], and keeps your code
 * flexible by cloning objects without coupling them to their concrete implementations.
 *
 * <p>[1] Resource savings are more noticeable when creating complex objects or a large quantity.
 */
@Slf4j
class PrototypeTest {

  private static List<Orbiter> getOrbiters() {
    return List.of(
        new OrbiterMk1(),
        new OrbiterMk2(),
        new Orbiter() {
          @Override
          public void doOrbit(Planet planet) {
            log.info("PrototypeOrbiterMk3 orbits planet {}.", planet);
          }
        });
  }

  /**
   * In space, we need to be very careful with our resources. To explore the solar system, we need
   * many different types of {@link Orbiter}s. We can't afford to waste time on assembling each orbiter from
   * scratch. Use the prototype pattern to create copies of orbiters.
   */
  @Test
  void prototypePattern() {
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