package space;

import lombok.Getter;

@Getter
public enum Planet {
  MERCURY(0.377, 440),
  VENUS(0.9032, 730),
  EARTH(1, 330),
  MARS(0.379, 300),
  JUPITER(2.528, 150, true, true),
  SATURN(1.065, 134, true, true),
  URANUS(0.886, 76, true, true),
  NEPTUNE(1.137, 72, true, true);

  private final double relativeGravity;
  private final int maxTempKelvin;
  private final boolean isGasGiant;
  private final boolean hasRings;

  Planet(double relativeGravity, int maxTempKelvin) {
    this(relativeGravity, maxTempKelvin, false, false);
  }

  Planet(double relativeGravity, int maxTempKelvin, boolean isGasGiant, boolean hasRings) {
    this.relativeGravity = relativeGravity;
    this.maxTempKelvin = maxTempKelvin;
    this.isGasGiant = isGasGiant;
    this.hasRings = hasRings;
  }
}