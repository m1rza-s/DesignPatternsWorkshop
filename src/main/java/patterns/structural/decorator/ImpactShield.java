package patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImpactShield extends CapsuleLayer {

  public ImpactShield(Capsule capsule) {
    super(capsule);
  }

  @Override
  public String getStructure() {
    return "I %s".formatted(super.getStructure());
  }
}