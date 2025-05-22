package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.structural.adapter.Canadarm;
import patterns.structural.adapter.EnglishCanadarm;

/**
 * ADAPTER PATTERN
 *
 * <p>Purpose: Transforms between incompatible types using a middle-layer class that translates one type into another.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you need to use an existing class with an incompatible interface</li>
 *   <li>When you want to reuse existing functionality</li>
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
   * can manipulate objects in zero-gravity. Sadly, the Canadarm's UI is in French.
   *
   * <p>Use the mediator pattern to translate the Canadarm's UI to German.
   */
  @Test
  void example() {
    var canadarm = new Canadarm();
    var english = new EnglishCanadarm(canadarm);

    var originalLogs = List.of(canadarm.attraper(), canadarm.contracter(), canadarm.etendre());
    var translatedLogs = List.of(english.grab(), english.contract(), english.extend());

    log.info(originalLogs.toString());
    log.info(translatedLogs.toString());

    assertThat(originalLogs.size()).isEqualTo(translatedLogs.size());
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  add German translation
     *  combine the German and English translations
     * */
  }
}