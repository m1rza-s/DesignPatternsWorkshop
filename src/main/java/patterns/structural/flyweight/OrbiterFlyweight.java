package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import patterns.creational.prototype.Orbiter;

public class OrbiterFlyweight {

  private static final Map<String, Orbiter> missions = new HashMap<>();

  public static Orbiter getOrCreate(String mission) {
    return missions.computeIfAbsent(mission, DedicatedOrbiterMk2::new);
  }

  public static int countOrbiters() {
    return missions.size();
  }
}