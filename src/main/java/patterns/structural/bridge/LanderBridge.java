package patterns.structural.bridge;

import patterns.creational.factory.Lander;
import space.Planet;

public class LanderBridge extends Bridge {

  public LanderBridge(Lander lander) {
    super(lander);
  }

  @Override
  public void act(Planet planet) {
    super.lander.doLand(planet);
  }
}