package patterns.behavioural.memento;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Logbook {

  private final List<Entry.PreviousState> history = new ArrayList<>();
  private final Entry latest = new Entry();

  public String getLatest() {
    return latest.getCurrentState();
  }

  public void write(String logEntry) {
    log.info("Writing log entry: {}", logEntry);
    history.add(latest.save(logEntry));
  }

  public void undo() {
    log.info("Undoing history");
    Entry.PreviousState previousState = history.getFirst();
    latest.undo(previousState);
    history.removeFirst();
  }

}