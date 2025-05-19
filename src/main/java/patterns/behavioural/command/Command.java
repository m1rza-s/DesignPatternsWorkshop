package patterns.behavioural.command;

import lombok.Getter;

@Getter
public abstract class Command {

  protected boolean complete = false;

  public abstract void execute();

}