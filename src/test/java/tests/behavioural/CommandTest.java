package tests.behavioural;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import patterns.behavioural.command.Command;
import patterns.behavioural.command.ExplorePlan;
import patterns.behavioural.command.GoCommand;
import patterns.behavioural.command.LandCommand;
import patterns.creational.prototype.OrbiterMk2;
import space.Planet;

/**
 * COMMAND PATTERN
 *
 * <p>Purpose: Converts method calls into objects, allowing them to be passed as arguments or switched at runtime.
 *
 * <p>When to use:
 * <ul>
 *   <li>When you want to parameterize objects with operations</li>
 *   <li>When you want to queue, schedule, or execute operations remotely</li>
 * </ul>
 *
 * <p>Common Pitfalls:
 * <ul>
 *   <li>Creating too many small command classes</li>
 *   <li>Not properly handling command parameters</li>
 * </ul>
 */
class CommandTest {

  /**
   * To explore a planet, we need a plan. The plan consists of a series of commands, but we cannot be
   * 100% sure which commands we will need, so we need a framework to try different plans.
   *
   * <p>Use the command pattern to create a framework plan to explore a planet.
   */
  @Test
  void example() {
    var plan = new ExplorePlan();

    var orbiter = new OrbiterMk2();
    plan.addCommands(new GoCommand(orbiter, Planet.MARS), new LandCommand(orbiter));

    plan.execute();

    assertThat(plan.getCommands().get(0) instanceof GoCommand).isTrue();
    assertThat(plan.getCommands().get(1) instanceof LandCommand).isTrue();
    assertThat(plan.getCommands()).allMatch(Command::isComplete);
  }

  @Test
  @Disabled
  void todo() {
    /*
     * todo:
     *  implement and use your own command
     *  create a fail-state command
     * */
  }
}