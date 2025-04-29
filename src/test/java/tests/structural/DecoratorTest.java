package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.structural.decorator.*;

/**
 * DECORATOR PATTERN
 *
 * <p>Purpose: Wraps an object to add new functionality at runtime without modifying its structure.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to add responsibilities to objects dynamically</li>
 *   <li>When extension by subclassing is impractical</li>
 *   <li>When you want to keep new functionality separate</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating too many small decorator classes</li>
 *   <li>Order of decoration can matter</li>
 * </ul>
 */
public class DecoratorTest {

  /**
   * We have a space capsule that needs to be protected from heat and impact. The capsule has a core
   * structure that needs to be wrapped with heat and impact shields. We are uncertain about the
   * exact order of layers.
   *
   * <p>Use the decorator pattern to add heat and impact shields to the core structure.
   */
  @Test
  void example() {
    Capsule capsule = new ImpactShield(new HeatShield(new Core()));

    assertThat(capsule.getStructure()).isEqualTo("I H [CORE]");
  }

  @Test
  @Disabled
  void todo() {
    /*
    * todo:
    *  somehow, our top scientists have failed to produce a radiation shield
    *  create a radiation shield decorator and add it to the capsule in this configuration
    *  R I H [CORE]
    * */
  }
}