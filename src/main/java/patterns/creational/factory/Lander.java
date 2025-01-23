package patterns.creational.factory;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.singleton.MissionControl;
import space.Planet;

@Slf4j
@Getter
@Setter
public abstract class Lander {

  private UUID channel;
  private int id;

  Lander() {
    this.id = MissionControl.contact().getLanders().size();
    this.channel = UUID.randomUUID();
    MissionControl.contact().getLanders().add(this);
  }

  public abstract Planet getPlanet();

  public void doLand(Planet planet) {
    if (planet.equals(getPlanet())) {
      log.info("{} #{} is landing on {}", this.getClass().getSimpleName(), id, planet);
      return;
    }
    throw new IllegalArgumentException("Landing on %s failed!".formatted(planet));
  }

  public static class Factory {

    private Factory() {}

    public static Lander create(Planet planet) {
      return switch (planet) {
        case MARS -> new MarsLander();
        case SATURN -> new SaturnLander();
        case VENUS -> new VenusLander();
      };
    }
  }
}
