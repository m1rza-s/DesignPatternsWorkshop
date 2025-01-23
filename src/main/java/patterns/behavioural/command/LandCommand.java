package patterns.behavioural.command;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.prototype.Orbiter;

@Slf4j
@Getter
public class LandCommand implements Command {

  private final Orbiter orbiter;
  private boolean complete;

  public LandCommand(Orbiter orbiter) {
    this.orbiter = orbiter;
  }

  @Override
  public void execute() {
    log.info("{} searching for LZ...", orbiter);
    complete = true;
  }


}