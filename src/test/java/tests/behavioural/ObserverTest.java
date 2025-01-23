package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;
import patterns.behavioural.observer.FaxSubscriber;
import patterns.behavioural.observer.NotificationService;
import patterns.behavioural.observer.Subscriber;

/**
 * OBSERVER PATTERN allows a publisher object to notify a set of subscriber objects when the
 * publisher's state changes. This works even if the set of subscribers is dynamic or unknown
 * beforehand. It supports adding new subscriber types without modifying the publisher’s code,
 * provided there’s a shared interface.
 */
class ObserverTest {

  /**
   * Many world organizations are interested in our mission. We need to notify them of any important
   * updates.
   *
   * <p>Use the Observer pattern to implement the {@link NotificationService} class.
   */
  @Test
  void observerPattern() {
    List<Subscriber> spaceAgencies =
        List.of(
            new FaxSubscriber("+496151902000"),
            new FaxSubscriber("+496151902011"),
            new FaxSubscriber("+496151902022"));

    var service = new NotificationService(spaceAgencies);
    service.publish("Water on Mars!");

    spaceAgencies.forEach(sub -> assertThat(sub.getUpdates()).isEqualTo(List.of("Water on Mars!")));
  }

  @Test
  void todo() {
    /*
     * todo:
     *  implement a new subscriber type
     *  use it in combination with the existing subscriber type
     *  publish a new message
     * */
  }
}