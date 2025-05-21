package patterns.structural.bridge;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
@Getter
public abstract class Sensor {

  private final Resolution resolution;

  protected Sensor(Resolution resolution) {
    this.resolution = resolution;
  }

  public String sense(Planet planet) {
    var data =
        "%s %s is analysing planet %s"
            .formatted(
                resolution.getClass().getSimpleName(), this.getClass().getSimpleName(), planet);
    log.info(data);
    return data;
  }
}