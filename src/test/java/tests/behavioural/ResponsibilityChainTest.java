package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static space.Planet.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import patterns.behavioural.responsabilitychain.*;

/**
 * RESPONSIBILITY CHAIN PATTERN processes a request through a chain of handlers, where each handler
 * decides to process the request or pass it to the next. This pattern is useful for executing
 * multiple handlers in a specific order, allowing flexible reordering, insertion, or removal of
 * handlers.
 */
class ResponsibilityChainTest {

  /**
   * We must minimize the risk to our orbiters. We need to check the gravity and temperature of each
   * planet before sending an orbiter.
   *
   * <p>Use the Responsibility Chain pattern to implement the {@link Chain} class.
   */
  @Test
  void responsibilityChainPattern() {
    Chain checklist = Chain.of(new GravityCheck(), new TempCheck());

    assertThat(checklist.doCheck(MARS)).isTrue();
    List.of(MERCURY, VENUS).forEach(planet -> assertThat(checklist.doCheck(planet)).isFalse());
    List.of(JUPITER, SATURN, NEPTUNE).forEach(p -> assertThat(checklist.doCheck(p)).isFalse());
  }

  @Test
  void todo() {
    /*
     * todo:
     *   rings represent a hazard to orbiters
     *   expand the chain to check if the planet has a ring
     * */
  }
}