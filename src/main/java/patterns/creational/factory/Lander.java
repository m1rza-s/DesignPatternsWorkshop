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
      return switch (planet) {
        case JUPITER, SATURN -> new GasGiantLander();
        default -> throw new IllegalArgumentException("Unsupported planet: %s".formatted(planet));
      };
    }
  }
}