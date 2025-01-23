package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk2;

public class OrbiterCache {

  private static final Map<String, Orbiter> missions = new HashMap<>();

  public static Orbiter getOrCreate(String mission) {
    return missions.computeIfAbsent(mission, NamedOrbiterMk2::new);
  }

  public static int countOrbiters() {
    return missions.size();
  }
}