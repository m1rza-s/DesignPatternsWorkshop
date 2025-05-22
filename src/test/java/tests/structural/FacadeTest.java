package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.structural.facade.FlightCheck;

/**
 * FACADE PATTERN
 *
 * <p>Purpose: Simplifies access to complex subsystems through a unified interface, enhancing readability.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to provide a simple interface to a complex subsystem</li>
 *   <li>When there are many dependencies between clients and implementation classes</li>
 *   <li>When you want to layer your subsystems</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating a "god object" that does too much</li>
 *   <li>Not allowing access to subsystems when needed</li>
 * </ul>
 */
public class FacadeTest {

  /**
   * We have a flight control system that needs to perform preflight checks and launch a rocket. The
   * system has multiple subsystems that need to be initialized and coordinated.
   *
   * <p>Use the facade pattern to simplify the process of launching a rocket.
   */
  @Test
  void example() {
    var check = new FlightCheck();

    assertThatCode(check::launch).doesNotThrowAnyExceptionExcept(IllegalStateException.class);
    var verifications = check.verify();

    assertThat(verifications.contains("AltitudeMonitor OK")).isTrue();
    assertThat(verifications.contains("ThrustVectoring OK")).isTrue();
    assertThatCode(check::launch).doesNotThrowAnyException();
  }

  @Test
  @Disabled
  void todo() {
    /*
    * todo:
    *  make sure the spacecraft is properly fueled before launch
    *  expand the flight check to include a fuel check
    * */
  }
}