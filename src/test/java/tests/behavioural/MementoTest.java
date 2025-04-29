package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.memento.Logbook;

/**
 * MEMENTO PATTERN
 *
 * <p>Purpose: Captures and restores an object's internal state without violating encapsulation.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you need to save and restore an object's state</li>
 *   <li>When direct interface to obtaining state would expose implementation details</li>
 *   <li>When you need to implement undo/redo functionality</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Memory consumption with many mementos</li>
 *   <li>Not properly encapsulating state</li>
 * </ul>
 */
class MementoTest {

  /**
   * Our mission requires a logbook to keep track of all the important information. We must be certain
   * that we can undo any changes made to the logbook to prevent mistakes.
   *
   * <p>Use the Memento pattern to implement the {@link Logbook} class.
   */
  @Test
  void example() {
    Logbook logbook = new Logbook();
    logbook.write("First log entry");
    logbook.write("Second log entry");
    logbook.undo();
    assertThat(logbook.getLatest()).isEqualTo("First log entry");
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  expand the Logbook class to include a redo method
     *  pass a test that writes two log entries, undoes one, and redoes it
     * */
  }
}