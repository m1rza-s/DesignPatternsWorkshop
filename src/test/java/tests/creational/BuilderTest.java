package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import patterns.creational.builder.Message;
import patterns.creational.singleton.MissionControl;

class BuilderTest {

  /**
   * BUILDER PATTERN enables us to create objects by setting only the required fields one by one.
   */
  @Test
  void builderPattern() {
    var newMessage = new Message.Builder().title("Mission Status").content("READY").build();

    assertThat(newMessage)
        .extracting(Message::getTitle, Message::getContent, Message::getTargetChannel)
        .containsExactly("Mission Status", "READY", MissionControl.contact().getChannel());
  }
}
