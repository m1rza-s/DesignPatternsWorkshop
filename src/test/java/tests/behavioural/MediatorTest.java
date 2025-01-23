package tests.behavioural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.Test;
import patterns.behavioural.mediator.EnglishInterface;

/**
 * MEDIATOR PATTERN extracts relationships between classes into a separate mediator class,
 * decoupling them so they communicate indirectly. This makes it easy to define new ways for
 * components to interact and allows you to reuse any component in different applications.
 */
class MediatorTest {

  /**
   * Canada has donated their famous Canadarm to our mission. The Canadarm is a complex system that
   * can manipulate objects in zero-gravity. Sadly, the Canadarm's interface is in French.
   *
   * <p>Use the mediator pattern to translate the Canadarm's interface to English.
   */
  @Test
  void mediatorPattern() {
    var ctrl = new EnglishInterface();

    assertThatCode(
            () -> {
              ctrl.extend();
              ctrl.grab();
              ctrl.contract();
            })
        .doesNotThrowAnyException();
  }

  @Test
  void todo() {
    /*
     * todo:
     *  create a Spanish interface
     *  create an interface that combines both English and Spanish interfaces
     * */
  }
}