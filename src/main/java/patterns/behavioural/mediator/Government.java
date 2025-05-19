package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Government extends Institution {

  public Government(ScienceApi api, String name) {
    super(api, name);
  }

  @Override
  public void receive(String message) {
    log.info("'{}' received by {}", message, name);
  }
}