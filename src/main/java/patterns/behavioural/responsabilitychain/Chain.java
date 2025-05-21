package patterns.behavioural.responsabilitychain;

import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public abstract class Chain {
  private Chain next;

  public static Chain of(Chain first, Chain... chain) {
    Chain head = first;
    for (Chain nextInChain : chain) {
      head.next = nextInChain;
      head = nextInChain;
    }
    return first;
  }

  public abstract boolean doCheck(Planet planet);

  protected boolean nextCheck(Planet planet) {
    if (next == null) {
      log.info("All checks passed for planet {}", planet);
      return true;
    }
    return next.doCheck(planet);
  }
}