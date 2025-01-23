package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.structural.facade.FlightCheck;

/**
 * FACADE PATTERN simplifies access to complex subsystems through a front-facing interface,
 * enhancing readability and applying Single Responsibility.
 */
public class FacadeTest {

  /**
   * We have a flight control system that needs to perform preflight checks and launch a rocket. The
   * system has multiple subsystems that need to be initialized and coordinated.
   *
   * <p>Use the facade pattern to simplify the process of launching a rocket.
   */
  @Test
  void facadePattern() {
    var check = new FlightCheck();

    assertThatCode(check::launch).doesNotThrowAnyExceptionExcept(IllegalStateException.class);
    assertThat(check.verify()).isEqualTo(List.of("AltitudeMonitor OK", "ThrustVectoring OK"));
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