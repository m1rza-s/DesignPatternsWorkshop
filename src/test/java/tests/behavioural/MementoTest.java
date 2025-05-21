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
   * Our mission requires a logbook to keep track of all the important information.
   *
   * <p>Use the Memento pattern to implement the {@link Logbook} class.
   */
  @Test
  void example() {
    Logbook logbook = new Logbook();
    logbook.write("One");
    logbook.write("Two");
    logbook.undo();
    assertThat(logbook.getLatest()).isEqualTo("One");
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  expand the Logbook support a redo functionality
     *  use it to restore the last undone entry
     *  try undoing in an empty logbook
     * */
  }
}