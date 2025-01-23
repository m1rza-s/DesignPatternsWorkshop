package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;
import patterns.behavioural.memento.Logbook;

/**
 * MEMENTO PATTERN is used to save and restore an object’s state without exposing its internal
 * details. It creates full copies of the object’s state and delegates snapshot creation to the
 * object itself, ensuring the original data remains safe and secure.
 */
class MementoTest {

/**
* Our mission requires a logbook to keep track of all the important information. We must be certain that we can undo any changes made to the logbook to prevent mistakes.
 *
 * <p>Use the Memento pattern to implement the {@link Logbook} class.
*/
  @Test
  void mementoPattern() {
    Logbook logbook = new Logbook();
    logbook.write("First log entry");
    logbook.write("Second log entry");
    logbook.undo();
    assertThat(logbook.getLatest()).isEqualTo("First log entry");
  }

  @Test
  void todo() {
    /*
     * todo:
     *  expand the Logbook class to include a redo method
     *  pass a test that writes two log entries, undoes one, and redoes it
     * */
  }
}