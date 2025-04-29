package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.behavioural.visitor.OrbitVisitor;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk1;
import space.Planet;

/**
 * VISITOR PATTERN
 *
 * <p>Purpose: Separates algorithms from the objects they operate on, allowing new operations without changing the objects.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you need to perform operations on all elements of a complex object structure</li>
 *   <li>When you want to add new operations without changing the classes of the elements</li>
 *   <li>When related operations are grouped in a visitor</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Adding new element types requires changing all visitors</li>
 *   <li>Complex implementation in languages without double dispatch</li>
 * </ul>
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
  void example(Orbiter orbiter) {
    var visitor = new OrbitVisitor(Planet.MARS);
    assertThatCode(() -> visitor.visit(orbiter)).doesNotThrowAnyException();
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  we want to allow other space agencies to control our Landers
     *  implement a visitor which allows controlled access to our Landers
     */
  }
}