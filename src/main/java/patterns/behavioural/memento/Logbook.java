package patterns.behavioural.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Logbook {

  private final Deque<Entry.Memento> history = new LinkedList<>();
  private final Entry latest = new Entry();

  public String getLatest() {
    return latest.getState();
  }

  public void write(String logEntry) {
    history.add(latest.save(logEntry));
  }

  public void undo() {
    latest.undo(history.pop());
  }

}