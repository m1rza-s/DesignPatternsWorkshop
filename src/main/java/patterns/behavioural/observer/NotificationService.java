package patterns.behavioural.observer;

import java.util.List;

public class NotificationService {
  private final List<Subscriber> subscribers;

  public NotificationService(List<Subscriber> subscribers) {
    this.subscribers = subscribers;
  }

  public void publish(String scientificBreakthrough) {
    subscribers.forEach(s -> s.update(scientificBreakthrough));
  }
}