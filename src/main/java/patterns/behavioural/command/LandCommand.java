package patterns.behavioural.command;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.prototype.Orbiter;

@Slf4j
@Getter
public class LandCommand extends Command {

  private final Orbiter orbiter;


  public LandCommand(Orbiter orbiter) {
    this.orbiter = orbiter;
  }

  @Override
  public void execute() {
    log.info("{} searching for LZ...", orbiter);
    super.complete = true;
  }


}