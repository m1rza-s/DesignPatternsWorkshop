package patterns.behavioural.memento;

import lombok.Getter;

@Getter
public class Entry {

  private String currentState;

  public PreviousState save(String newState) {
    this.currentState = newState;
    return new PreviousState(newState);
  }

  public void undo(PreviousState m) {
    currentState = m.state;
  }

  public record PreviousState(String state) {}
}