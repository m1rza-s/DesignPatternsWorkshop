package patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class AltitudeMonitor extends Check {
  @Override
  public String verify() {
    log.info("Power supply online and stable.");
    log.info("Sensor calibration complete. Readings within acceptable range.");
    log.info("Communication link established with flight control.");
    log.info("Preflight checks complete. Ready for flight.");
    super.checkOK = true;
    return "%s OK".formatted(this.getClass().getSimpleName());
  }

  public void activate() {
    if (!super.checkOK) {
      throw new IllegalStateException("Altitude monitor is not ready.");
    }
    log.info("Altitude monitor is activated.");
  }
}