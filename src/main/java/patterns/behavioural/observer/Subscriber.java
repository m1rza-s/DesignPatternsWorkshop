package patterns.behavioural.observer;

import java.util.List;

public interface Subscriber {

  void update(String news);

  List<String> getUpdates();
}