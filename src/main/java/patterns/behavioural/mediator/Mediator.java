package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Mediator implements ScienceApi {

  private final List<Institution> institutions = new ArrayList<>();

  @Override
  public void register(Institution institution) {
    institutions.add(institution);
  }

  @Override
  public void send(String data) {
    for (Institution institution : institutions) {
      institution.receive(data);
    }
  }
}