package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk2;
import patterns.structural.composite.Fleet;
import patterns.structural.composite.Squad;
import space.Planet;

/**
 * COMPOSITE PATTERN
 *
 * <p>Purpose: Creates tree structures of objects, allowing uniform handling of both individual objects and compositions.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to represent part-whole hierarchies</li>
 *   <li>When clients should be able to ignore differences between compositions and individual objects</li>
 *   <li>When you need to work with recursive structures</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Not properly handling operations that only make sense for certain components</li>
 *   <li>Performance issues with deep hierarchies</li>
 * </ul>
 */
class CompositeTest {

  /**
   * We have a fleet of rovers that need to explore the solar system. The fleet consists of squads
   * of rovers. Each squad has a team of rovers.
   *
   * <p>Use the composite pattern to command fleets of {@link Orbiter}s.
   *
   * @param planet to explore
   */
  @ParameterizedTest
  @MethodSource("space.Planet#values")
  void example(Planet planet) {
    var fleet = new Fleet();
    fleet.add(new Squad(List.of(new OrbiterMk2(), new OrbiterMk2(), new OrbiterMk2())));
    fleet.add(new Squad(List.of(new OrbiterMk2(), new OrbiterMk2(), new OrbiterMk2())));
    assertThatCode(() -> fleet.explore(planet)).doesNotThrowAnyException();
    assertThat(fleet.count()).isEqualTo(6);
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  to better balance the workload, we need to be able to combine fleets while retaining their organisational structure
     *  expand the Fleet class to allow combining fleets
     * */
  }
}