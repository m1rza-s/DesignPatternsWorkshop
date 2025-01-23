package patterns.behavioural.command;

public interface Command {

  void execute();

  boolean isComplete();
}