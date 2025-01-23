package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import lombok.Getter;
import space.Planet;

@Getter
public class Fleet implements Member {

  private final List<Member> members = new ArrayList<>();

  @Override
  public void explore(Planet planet) {
    for (Member member : members) {
      member.explore(planet);
    }
  }

  @Override
  public int count() {
    return members.stream().mapToInt(Member::count).sum();
  }
}
