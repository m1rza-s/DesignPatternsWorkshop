package patterns.behavioural.responsabilitychain;

import space.Planet;

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
      return true;
    }
    return next.doCheck(planet);
  }
}