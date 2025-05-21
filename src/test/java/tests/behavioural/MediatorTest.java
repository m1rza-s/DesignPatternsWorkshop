package tests.behavioural;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.mediator.Government;
import patterns.behavioural.mediator.Mediator;
import patterns.behavioural.mediator.Scientist;

/**
 * MEDIATOR PATTERN
 *
 * <p>Purpose: Centralizes communication between components, reducing direct connections and dependencies.
 *
 * <p>When to use:
 * <ul>
 *   <li>When a set of objects communicate in well-defined but complex ways</li>
 *   <li>When reusing an object is challenging because it communicates with many other objects</li>
 *   <li>When you want to customize behavior distributed between several classes without subclassing</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating a mediator that becomes a "god object"</li>
 *   <li>Not properly defining the communication protocol</li>
 * </ul>
 */
class MediatorTest {


  @Test
  void example() {
    var ourSpaceMission = new Mediator();

    var humboldt = new Scientist(ourSpaceMission, "Humboldt");
    var bmd = new Government(ourSpaceMission, "BMD");

    ourSpaceMission.send("[NEW DATA]");
    humboldt.send("We have made a discovery!");
    bmd.send("We are interested in your discovery.");
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  add a another institution (private company)
     *  expand the pattern to filter by institution type
     *  add support for private messaging
     * */
  }
}