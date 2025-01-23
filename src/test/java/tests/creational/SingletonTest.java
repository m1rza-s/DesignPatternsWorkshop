package tests.creational;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import patterns.creational.singleton.MissionControl;

class SingletonTest {

  /** SINGLETON PATTERN ensures that there is exactly one instance of a class. */
  @Test
  void singletonPattern() {
    var channel = MissionControl.contact().getChannel();
    for (int i = 0; i < 100; i++) {
      assertThat(channel).isEqualTo(MissionControl.contact().getChannel());
    }
  }
}
