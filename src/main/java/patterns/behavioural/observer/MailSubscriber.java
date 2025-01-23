package patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailSubscriber implements Subscriber {

  private final String email;
  private final List<String> updates = new ArrayList<>();

  public MailSubscriber(String email) {
    this.email = email;
  }

  @Override
  public void update(String news) {
    updates.add(news);
    log.info("Sending update to {}", email);
  }

  @Override
  public List<String> getUpdates() {
    return updates;
  }
}