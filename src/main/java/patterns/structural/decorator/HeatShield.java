package patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HeatShield extends CapsuleLayer {

  public HeatShield(Capsule capsule) {
    super(capsule);
  }

  @Override
  public String getStructure() {
    return "H %s".formatted(super.getStructure());
  }
}