package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.template.BasicTransmission;
import patterns.creational.singleton.MissionControl;

/**
 * TEMPLATE PATTERN turns an algorithm into a template method, allowing subclasses to provide
 * concrete implementations. This way the common parts of the algorithm are centralized and
 * structure is preserved, but the details can vary.
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
  void templatePattern() {
    assertThatCode(() -> new BasicTransmission().startProcedure()).doesNotThrowAnyException();
    assertThat(MissionControl.contact().getMessages().size()).isEqualTo(3);
  }

  @Test
  @Disabled
  void todo() {
    /*
    * todo:
    *  we will need to establish contact with other spacecraft
    *  implement a new transmission procedure which doesn't default to Earth's channel
    * */
  }
}