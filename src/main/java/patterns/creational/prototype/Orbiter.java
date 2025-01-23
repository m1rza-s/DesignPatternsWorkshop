package patterns.creational.prototype;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Getter
@Setter
@Slf4j
public abstract class Orbiter implements Cloneable {
  private UUID channel;
  private int id;

  protected Orbiter(int id) {
    this.id = id;
    this.channel = UUID.randomUUID();
  }

  public void doOrbit(Planet planet) {
    log.info("{} #{} is orbiting {}", this.getClass().getSimpleName(), id, planet);
  }

  @SneakyThrows
  @Override
  public Orbiter clone() {
    return (Orbiter) super.clone();
  }

  public Orbiter clone(int id) {
    var clone = this.clone();
    clone.setId(id);
    return clone;
  }
}
