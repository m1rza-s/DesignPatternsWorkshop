package patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Logbook {

  private final List<Entry.PreviousState> history = new ArrayList<>();
  private final Entry latest = new Entry();

  public String getLatest() {
    return latest.getCurrentState();
  }

  public void write(String logEntry) {
    history.add(latest.save(logEntry));
  }

  public void undo() {
    Entry.PreviousState previousState = history.getFirst();
    latest.undo(previousState);
    history.removeFirst();
  }

}