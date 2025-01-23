package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.creational.builder.Message;
import patterns.creational.singleton.MissionControl;

/**
 * BUILDER PATTERN separates the construction of a complex object from its representation, allowing
 * for more controlled and flexible creation. It involves a builder class with setter methods for
 * individual fields and a {@code build()} method that constructs the final object.
 */
class BuilderTest {

  @AfterAll
  static void afterAll() {
    MissionControl.contact().getMessages().clear();
  }

  /**
   * For our space mission, we need to send {@link Message}s. There will be many messages used in different
   * circumstances so we need something that can be reused and easily created. Implement a builder
   * pattern to create messages.
   *
   * <p>Builders provides chainable methods which set fields and return the builder instance,
   * allowing for fluency. Builder instances can be reused to create multiple objects with different
   * values.
   */
  @Test
  void builderPattern() {
    Message message = new Message.Builder().title("Status").content("READY").build();

    assertThat(message)
        .extracting(Message::getTitle, Message::getContent)
        .containsExactly("Status", "READY");
  }

  /**
   * Objects created via builder can be easily expanded with new fields without requiring
   * modifications to the constructor and its usages.
   */
  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  we want to report our findings to Earth
     *  expand the Message and MessageBuilder to include byte[] attachments
     * */
  }
}