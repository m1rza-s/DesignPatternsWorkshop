package patterns.creational.builder;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import patterns.creational.singleton.MissionControl;

@Getter
@Setter
public class Message {

  private final String title;
  private final String content;
  private UUID targetChannel;

  private Message(String title, String content, UUID targetChannel) {
    this.title = title;
    this.content = content;
    this.targetChannel = targetChannel;
  }

  public static class Builder {
    private String title;
    private String content;
    private UUID targetChannel = MissionControl.contact().getChannel();

    public Message build() {
      return new Message(title, content, targetChannel);
    }

    public Builder title(String s) {
      title = s;
      return this;
    }

    public Builder content(String s) {
      content = s;
      return this;
    }

    public Builder targetChannel(UUID channel) {
      targetChannel = channel;
      return this;
    }
  }
}
