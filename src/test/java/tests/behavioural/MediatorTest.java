package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.mediator.EnglishTranslation;

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

  /**
   * Canada has donated their famous Canadarm to our mission. The Canadarm is a complex system that
   * can manipulate objects in zero-gravity. Sadly, the Canadarm's interface is in French.
   *
   * <p>Use the mediator pattern to translate the Canadarm's interface to English.
   */
  @Test
  void example() {
    var ctrl = new EnglishTranslation();

    assertThatCode(
            () -> {
              ctrl.extend();
              ctrl.grab();
              ctrl.contract();
            })
        .doesNotThrowAnyException();
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  create a Spanish translation
     *  combine the Spanish translation with the English translation
     * */
  }
}