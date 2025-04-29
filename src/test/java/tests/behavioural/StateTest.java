package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.UUID;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.state.BasicAntenna;
import patterns.creational.singleton.MissionControl;

/**
 * STATE PATTERN
 *
 * <p>Purpose: Changes object behavior when its state changes by delegating state-specific behavior to separate classes.
 *
 * <p>When to use:
 * <ul>
 *   <li>When an object's behavior depends on its state</li>
 *   <li>When you have many conditional statements in methods</li>
 *   <li>When you want to avoid large state machines</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Proliferation of state classes</li>
 *   <li>Not properly handling state transitions</li>
 * </ul>
 */
class StateTest {

  @AfterAll
  static void afterAll() {
    MissionControl.contact().getMessages().clear();
  }

  /**
   * Our mission requires a reliable communication system. We need to ensure that the antenna is
   * powered on before transmitting any messages.
   *
   * <p>Use the State pattern to implement the {@link BasicAntenna} class.
   */
  @Test
  void example() {
    var antenna = new BasicAntenna();
    UUID earthChannel = MissionControl.contact().getChannel();
    assertThatCode(() -> antenna.transmit(earthChannel)).isInstanceOf(Exception.class);

    assertThatCode(
            () -> {
              antenna.powerOn();
              antenna.transmit(earthChannel);
              antenna.powerOff();
            })
        .doesNotThrowAnyException();

    assertThatCode(() -> antenna.transmit(earthChannel)).isInstanceOf(Exception.class);
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  we need a stand-by state for the antenna to be able to receive messages
     *  implement a new state for the antenna
     * */
  }
}