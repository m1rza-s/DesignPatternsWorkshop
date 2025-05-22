package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Mediator implements CommsApi {

  private final List<Institution> institutions = new ArrayList<>();

  @Override
  public void register(Institution i) {
    institutions.add(i);
  }

  @Override
  public void send(String s) {
    institutions.forEach(i -> i.receive(s));
  }
}