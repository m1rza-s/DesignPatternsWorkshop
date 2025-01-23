package patterns.structural.decorator;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class Core implements Capsule {

  @Override
  public String getStructure() {
    return "[CORE]";
  }
}