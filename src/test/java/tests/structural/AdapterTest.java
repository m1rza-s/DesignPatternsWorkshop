package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import patterns.structural.adapter.EnglishTranslation;

/**
 * ADAPTER PATTERN
 *
 * <p>Purpose: Transforms between incompatible types using a middle-layer class that translates one type into another.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you need to use an existing class with an incompatible interface</li>
 *   <li>When you want to reuse existing functionality</li>
 *   <li>When you need to work with legacy code</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating overly complex adapters</li>
 *   <li>Using adapters when refactoring would be better</li>
 * </ul>
 */
@Slf4j
class AdapterTest {

  /**
   * Canada has donated their famous Canadarm to our mission. The Canadarm is a complex system that
   * can manipulate objects in zero-gravity. Sadly, the Canadarm's interface is in French.
   *
   * <p>Use the mediator pattern to translate the Canadarm's interface to German.
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
     *  create a German translation for the Canadarm
     *  combine the German translation with the English translation
     * */
  }
}