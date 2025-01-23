package patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FaxSubscriber implements Subscriber {

  private final String fax;
  private final List<String> updates = new ArrayList<>();

  public FaxSubscriber(String fax) {
    this.fax = fax;
  }

  @Override
  public void update(String news) {
    updates.add(news);
    log.info("Sending update to {}", fax);
  }

  @Override
  public List<String> getUpdates() {
    return updates;
  }
}