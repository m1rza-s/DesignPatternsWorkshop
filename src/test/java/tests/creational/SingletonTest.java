package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.creational.singleton.MissionControl;

/**
 * SINGLETON PATTERN
 *
 * <p>Purpose: Ensures a class has only one instance while providing a global point of access to it.
 *
 * <p>When to use:
 * <ul>
 *   <li>When exactly one instance of a class is needed</li>
 *   <li>When you need controlled access to a shared resource</li>
 *   <li>When you need to coordinate actions across the system</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Not handling thread safety properly</li>
 *   <li>Creating hidden dependencies</li>
 * </ul>
 */
class SingletonTest {

  /**
   * Our mission requires a single point of contact to ensure all communication is secure and
   * reliable.
   * Use the singleton pattern to make sure that there can only be one instance of {@link MissionControl}.
   */
  @Test
  void example() {
    var instance = MissionControl.contact();

    assertThat(instance).isEqualTo(MissionControl.contact());
    assertThat(instance.getChannel()).isEqualTo(MissionControl.contact().getChannel());
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  our mission requires contact with the International Space Station (ISS)
     *  implement a new singleton class for the ISS
     * */
  }
}