package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import space.Planet;

public class Fleet implements Member {

  private final List<Member> squads = new ArrayList<>();

  public void add(Member member) {
    squads.add(member);
  }

  @Override
  public void explore(Planet planet) {
    for (Member member : squads) {
      member.explore(planet);
    }
  }

  @Override
  public int count() {
    return squads.stream().mapToInt(Member::count).sum();
  }
}