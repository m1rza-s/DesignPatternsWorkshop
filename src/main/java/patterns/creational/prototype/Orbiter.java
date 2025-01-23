package patterns.creational.prototype;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.visitor.Visitor;
import space.Planet;

@Getter
@Setter
@Slf4j
public abstract class Orbiter implements Cloneable {
  private UUID channel;

  protected Orbiter() {
    this.channel = UUID.randomUUID();
  }

  public void doOrbit(Planet planet) {
    throw new UnsupportedOperationException("This orbiter cannot orbit.");
  }

  public void consumeCommand(Visitor visitor) {
    visitor.visit(this);
  }

  @SneakyThrows
  @Override
  public Orbiter clone() {
    return (Orbiter) super.clone();
  }

  @Override
  public String toString() {
    return "%s {%s}".formatted(this.getClass().getSimpleName(), channel.toString().substring(0, 5));
  }
}