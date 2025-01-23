package patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Getter;
import patterns.creational.builder.Message;

@Getter
public class MissionControl {

  private static MissionControl instance;

  private final UUID channel;
  private final List<Message> messages = new ArrayList<>();

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