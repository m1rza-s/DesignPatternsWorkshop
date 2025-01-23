package patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Getter;
import patterns.creational.builder.Message;
import patterns.creational.factory.Lander;
import patterns.creational.prototype.Orbiter;

@Getter
public class MissionControl {

  private static MissionControl instance;

  private final UUID channel;
  private final List<Message> messages = new ArrayList<>();
  private final List<Lander> landers = new ArrayList<>();
  private final List<Orbiter> orbiters = new ArrayList<>();

  private MissionControl() {
    channel = UUID.randomUUID();
  }

  public static MissionControl contact() {
    if (instance == null) {
      instance = new MissionControl();
    }
    return instance;
  }
}
