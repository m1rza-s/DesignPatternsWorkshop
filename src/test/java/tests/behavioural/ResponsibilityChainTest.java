package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static space.Planet.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.responsabilitychain.*;

/**
 * CHAIN OF RESPONSIBILITY PATTERN
 *
 * <p>Purpose: Passes requests through a chain of handlers, each deciding to process or pass to the next handler.
 *
 * <p>When to use:
 * <ul>
 *   <li>When more than one object may handle a request</li>
 *   <li>When you want to issue a request to one of several objects without specifying the receiver explicitly</li>
 *   <li>When the set of handlers can be dynamically defined</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Requests with no handler</li>
 *   <li>Breaking the chain accidentally</li>
 *   <li>Circularity in chains</li>
 * </ul>
 */
class ResponsibilityChainTest {

  /**
   * We must minimize the risk to our orbiters. We need to check the gravity and temperature of each
   * planet before sending an orbiter.
   *
   * <p>Use the Responsibility Chain pattern to implement the {@link Chain} class.
   */
  @Test
  void example() {
    var checklist = Chain.of(new GravityCheck(), new TempCheck());

    assertThat(checklist.doCheck(MARS)).isTrue();
    assertThat(checklist.doCheck(MERCURY)).isFalse();
    assertThat(checklist.doCheck(JUPITER)).isFalse();
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *   rings represent a hazard to orbiters
     *   expand the chain to check if the planet has rings
     *   create a custom chain with custom checks
     * */
  }
}