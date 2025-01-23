package patterns.behavioural.memento;

import lombok.Getter;

@Getter
public class Entry {

  private String state;

  public Memento save(String newState) {
    this.state = newState;
    return new Memento(newState);
  }

  public void undo(Memento m) {
    state = m.state;
  }

  public record Memento(String state) {}
}