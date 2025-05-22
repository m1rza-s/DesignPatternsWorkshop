package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.template.BasicTransmission;
import patterns.creational.singleton.MissionControl;

/**
 * TEMPLATE PATTERN
 *
 * <p>Purpose: Defines an algorithm skeleton, letting subclasses override specific steps while keeping the structure intact.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to implement the invariant parts of an algorithm once</li>
 *   <li>When common behavior among subclasses should be factored into a common class</li>
 *   <li>When you want to control subclass extensions</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Not properly documenting which methods are intended to be overridden</li>
 *   <li>Creating deep inheritance hierarchies</li>
 * </ul>
 */
class TemplateTest {

  @AfterAll
  static void afterAll() {
    MissionControl.contact().getMessages().clear();
  }

  /**
   * Our mission requires a reliable communication system. We need a repeatable procedure to contact
   * Earth.
   *
   * <p>Use the Template pattern to implement the {@link BasicTransmission} class.
   */
  @Test
  void example() {
    assertThatCode(() -> new BasicTransmission().startProcedure()).doesNotThrowAnyException();
    assertThat(MissionControl.contact().getMessages().size()).isEqualTo(1);
  }

  @Test
  @Disabled
  void todo() {
    /*
    * todo:
    *  we will need to establish contact with other spacecraft
    *  implement a new transmission procedure which doesn't default to Earth's channel
    *  implement support for an array of antennas
    * */
  }
}