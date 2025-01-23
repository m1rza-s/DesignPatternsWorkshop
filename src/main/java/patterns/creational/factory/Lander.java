package patterns.creational.factory;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
@Getter
@Setter
public abstract class Lander {

  private UUID channel;

  Lander() {
    this.channel = UUID.randomUUID();
  }

  public abstract void doLand(Planet planet);

  public static class Factory {

    private Factory() {}

    public static Lander create(Planet planet) {
      return planet.isGasGiant() ? new GasGiantLander() : new PlanetLander();
    }
  }
}