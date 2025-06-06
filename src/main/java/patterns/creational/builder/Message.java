package patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class Message {

  private final String title;
  private final String content;
  private final UUID uuid;

  private Message(String title, String content) {
    this.title = title;
    this.content = content;
    this.uuid = UUID.randomUUID();
  }

  public static class Builder {
    private String title = null;
    private String content = null;

    public Message build() {
      return new Message(title, content);
    }

    public Builder title(String s) {
      title = s;
      return this;
    }

    public Builder content(String s) {
      content = s;
      return this;
    }
  }
}