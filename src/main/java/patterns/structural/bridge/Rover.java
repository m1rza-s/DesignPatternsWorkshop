package patterns.structural.bridge;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import patterns.creational.factory.Lander;
import patterns.creational.prototype.Orbiter;
import patterns.creational.prototype.OrbiterMk2;
import space.Planet;

@Getter
@Setter
@Slf4j
public class Rover {

  private final Lander lander;
  private final Orbiter orbiter;
  private UUID channel;

  public Rover(Planet planet) {
    this.channel = UUID.randomUUID();
    this.lander = Lander.Factory.create(planet);
    this.lander.setChannel(channel);
    this.orbiter = new OrbiterMk2(lander.getId(), "A better orbiter");
    this.orbiter.setChannel(channel);
  }

  public void doRove(Planet planet) {
    orbiter.doOrbit(planet);
    try {
      lander.doLand(planet);
    } catch (IllegalArgumentException e) {
      log.error(
          "{} #{} cannot land on {}, aborted!",
          lander.getClass().getSimpleName(),
          lander.getId(),
          planet);
      return;
    }
    log.info("{} #{} is roving on {}", this.getClass().getSimpleName(), lander.getId(), planet);
  }
}
