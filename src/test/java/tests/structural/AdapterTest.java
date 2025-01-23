package tests.structural;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.structural.adapter.FlipString;
import patterns.structural.adapter.Translator;

/**
 * ADAPTER PATTERN (aka wrapper pattern) acts as a transformer between incompatible types by
 * introducing a middle-layer class that translates one type into another. It promotes SPR and OCP,
 * enabling you to add new adapters without changing existing code.
 */
@Slf4j
class AdapterTest {

  /**
   * We may find alien messages that need to be translated. Use the adapter pattern to convert the
   * alien messages into readable strings.
   *
   * <p>Adapter patterns separate the adaption logic from the subject, allowing for easier
   * testability and addition of new translation methods.
   */
  @Test
  void adapterPattern() {
    var asFlippedString = Translator.apply(new FlipString(), "ecaps");
    assertThat(asFlippedString).isEqualTo("space");
  }

  @ParameterizedTest
  @MethodSource("alienMessages")
  @Disabled
  void todo(byte[] alienMessage) {
    /*
     * todo:
     *  we have uncovered alien messages
     *  create an adapter and apply it to decipher alien messages
     * */
  }

  private static List<byte[]> alienMessages() {
    return List.of(
        new byte[] {114, 117, 111, 106, 110, 111, 98},
        new byte[] {111, 108, 108, 101, 104},
        new byte[] {107, 105, 116, 97, 109, 101, 103});
  }
}