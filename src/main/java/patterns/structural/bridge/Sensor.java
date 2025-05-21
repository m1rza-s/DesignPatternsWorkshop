package patterns.structural.bridge;

import lombok.Getter;
import space.Planet;

@Getter
public abstract class Sensor {

  private final Resolution resolution;

  protected Sensor(Resolution resolution) {
    this.resolution = resolution;
  }

  public String sense(Planet planet) {
    return "%s %s is analysing planet %s"
        .formatted(resolution.getClass().getSimpleName(), this.getClass().getSimpleName(), planet);
  }
}