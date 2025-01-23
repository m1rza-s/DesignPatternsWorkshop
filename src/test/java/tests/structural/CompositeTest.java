package tests.structural;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import patterns.structural.bridge.Rover;
import patterns.structural.composite.Fleet;
import patterns.structural.composite.Squad;
import space.Planet;

class CompositeTest {

  /**
   * COMPOSITE PATTERN lets clients treat individual objects and compositions of objects uniformly.
   */
  @Test
  void compositePattern() {
    var fleet = new Fleet();

    var venusRoversSquadSouth = new ArrayList<Rover>();
    for (int i = 0; i < 13; i++) {
      venusRoversSquadSouth.add(new Rover(Planet.SATURN));
    }
    var venusRoversSquadNorth = new ArrayList<Rover>();
    for (int i = 0; i < 37; i++) {
      venusRoversSquadNorth.add(new Rover(Planet.VENUS));
    }

    fleet.getMembers().add(new Squad(venusRoversSquadNorth));
    fleet.getMembers().add(new Squad(venusRoversSquadSouth));
    fleet.explore(Planet.VENUS);
    assertThat(fleet.count()).isEqualTo(50);
  }
}
