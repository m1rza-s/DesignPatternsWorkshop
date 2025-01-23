package tests.structural;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import patterns.creational.builder.Message;
import patterns.creational.singleton.MissionControl;
import patterns.structural.adapter.Flipper;
import patterns.structural.adapter.Stringer;
import patterns.structural.adapter.Translator;

class AdapterTest {

  /**
   * ADAPTER PATTERN (aka wrapper pattern) is used to transform alien messages into human-readable
   * text.
   */
  @Test
  void adapterPattern() {
    List<byte[]> alienMessages =
        List.of(
            new byte[] {114, 117, 111, 106, 110, 111, 98},
            new byte[] {111, 108, 108, 101, 104},
            new byte[] {107, 105, 116, 97, 109, 101, 103});

    List<Message> messages = MissionControl.contact().getMessages();
    alienMessages.forEach(
        cipher -> {
          Message.Builder messageForEarth =
              new Message.Builder().title("Message %d".formatted(alienMessages.indexOf(cipher)));

          var asString = Translator.apply(new Stringer(), cipher);
          var asFlippedString = Translator.apply(new Flipper(), asString);
          messageForEarth.content(asFlippedString);
          messages.add(messageForEarth.build());
        });

    assertThat(messages)
        .isNotEmpty()
        .allMatch(translation -> translation.getContent().chars().allMatch(Character::isLetter));
  }
}
