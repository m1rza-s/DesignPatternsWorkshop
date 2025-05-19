package patterns.behavioural.command;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.prototype.Orbiter;
import space.Planet;

@Getter
@Slf4j
public class GoCommand extends Command {

  private final Orbiter orbiter;
  private final Planet location;

  public GoCommand(Orbiter o, Planet location) {
    this.orbiter = o;
    this.location = location;
  }

  @Override
  public void execute() {
    log.info("{} en route to {}", orbiter, location);
    super.complete = true;
  }
}