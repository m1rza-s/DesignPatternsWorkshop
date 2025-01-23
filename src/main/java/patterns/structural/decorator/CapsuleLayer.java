package patterns.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract class CapsuleLayer implements Capsule {

  private final Capsule wrappedCapsule;

  protected CapsuleLayer(Capsule capsule) {
    this.wrappedCapsule = capsule;
  }

  @Override
  public String getStructure() {
    return "%s".formatted(wrappedCapsule.getStructure());
  }
}