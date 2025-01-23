package patterns.structural.bridge;

import patterns.creational.factory.Lander;
import space.Planet;

public abstract class Bridge {
  protected Lander lander;

  public Bridge(Lander lander) {
    this.lander = lander;
  }

  public abstract void act(Planet planet);
}