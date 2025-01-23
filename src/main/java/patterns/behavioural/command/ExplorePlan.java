package patterns.behavioural.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExplorePlan {

  private final List<Command> commands = new ArrayList<>();

  public void addCommands(Command... c) {
    Collections.addAll(commands, c);
  }

  public void execute() {
    log.info("Executing plan: {} steps...", commands.size());
    for (Command command : commands) {
      command.execute();
      log.info("{}/{}", commands.indexOf(command) + 1, commands.size());
    }
    log.info("Execution complete!");
  }

  public List<Command> getCommands() {
    return Collections.unmodifiableList(commands);
  }
}