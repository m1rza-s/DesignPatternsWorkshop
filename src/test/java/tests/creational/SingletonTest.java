package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import patterns.creational.singleton.MissionControl;

/**
 * SINGLETON PATTERN ensures a class has only one instance while providing a global point of access.
 * It returns the same instance if it already exists and disables all other means of instantiation.
 */
class SingletonTest {

  /**
   * Our mission requires a single point of contact to ensure all communication is secure and
   * reliable.
   * Use the singleton pattern to make sure that there can only be one instance of {@link MissionControl}.
   */
  @Test
  void singletonPattern() {
    MissionControl instance = MissionControl.contact();

    assertThat(instance).isEqualTo(MissionControl.contact());
    assertThat(instance.getChannel()).isEqualTo(MissionControl.contact().getChannel());
  }

  @Test
  void todo() {
    /*
     * todo:
     *  our mission requires contact with the International Space Station (ISS)
     *  implement a new singleton class for the ISS
     * */
  }
}