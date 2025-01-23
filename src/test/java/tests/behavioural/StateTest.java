package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.UUID;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import patterns.behavioural.state.BasicAntenna;
import patterns.creational.singleton.MissionControl;

/**
 * STATE PATTERN enables an object to change its behavior based on its internal state by delegating
 * the behavior to specific state classes, promoting the SRP and OCP.
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
  void statePattern() {
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
  void todo() {
    /*
     * todo:
     *  we need a stand-by state for the antenna to be able to receive messages
     *  implement a new state for the antenna
     * */
  }
}