package patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import patterns.creational.singleton.MissionControl;

@Getter
@Setter
public class OrbiterMk2 extends Orbiter {

  private String description;

  public OrbiterMk2() {
    super(MissionControl.contact().getOrbiters().size());
    this.description = "Better than OrbiterMk1";
    MissionControl.contact().getOrbiters().add(this);
  }

  public OrbiterMk2(int id, String description) {
    super(id);
    this.description = description;
  }
}
