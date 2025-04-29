package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.creational.builder.Message;
import patterns.creational.singleton.MissionControl;

/**
 * BUILDER PATTERN
 *
 * <p>Purpose: Separates object construction from representation, allowing for more controlled and flexible creation.
 *
 * <p>When to use:
 * <ul>
 *   <li>When an object has many optional parameters</li>
 *   <li>When you want to create immutable objects</li>
 *   <li>When construction of an object involves multiple steps</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating builders for simple objects</li>
 *   <li>Not making the original class immutable</li>
 * </ul>
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
   * <p>Builders provide chainable methods which set fields and return the builder instance,
   * allowing for fluency. Builder instances can be reused to create multiple objects with different
   * values.
   */
  @Test
  void example() {
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