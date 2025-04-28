package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.behavioural.visitor.OrbitVisitor;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk1;
import space.Planet;

/**
 * VISITOR PATTERN keeps classes focused on their core responsibilities by isolating behaviors into
 * separate visitor classes, allowing new behaviors to be added without modifying existing ones (SRP
 * and OCP).
 */
class VisitorTest {

  private static List<Orbiter> getOrbiters() {
    return List.of(new OrbiterMk1(), new OrbiterMk1());
  }

  /**
   * Other space agencies will want to control our {@link Orbiter}s. We will allow them only certain
   * capabilities of our orbiters.
   *
   * <p>Use the Visitor pattern to implement a way for behavior to be decoupled from the Orbiter
   * classes.
   */
  @ParameterizedTest
  @MethodSource("getOrbiters")
  void visitorPattern(Orbiter orbiter) {
    var visitor = new OrbitVisitor(Planet.MARS);
    assertThatCode(() -> visitor.visit(orbiter)).doesNotThrowAnyException();
  }

  @Test
  void todo() {
    /*
     * todo:
     *  we want to allow other space agencies to control our Landers
     *  implement a visitor which allows controlled access to our Landers
     */
  }
}