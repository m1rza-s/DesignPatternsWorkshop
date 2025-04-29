package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.observer.FaxSubscriber;
import patterns.behavioural.observer.NotificationService;
import patterns.behavioural.observer.Subscriber;

/**
 * OBSERVER PATTERN
 *
 * <p>Purpose: Notifies subscriber objects automatically when a publisher object's state changes.
 *
 * <p>When to use:
 * <ul>
 *   <li>When a change to one object requires changing others</li>
 *   <li>When an object should notify other objects without knowing who they are</li>
 *   <li>When you want to decouple objects that work together</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Memory leaks if observers aren't properly unregistered</li>
 *   <li>Unexpected updates due to dependency chains</li>
 * </ul>
 */
class ObserverTest {

  /**
   * Many world organizations are interested in our mission. We need to notify them of any important
   * updates.
   *
   * <p>Use the Observer pattern to implement the {@link NotificationService} class.
   */
  @Test
  void example() {
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
  @Disabled
  void todo() {
    /*
     * todo:
     *  implement a new subscriber type
     *  use it in combination with the existing subscriber type
     *  publish a new message
     * */
  }
}