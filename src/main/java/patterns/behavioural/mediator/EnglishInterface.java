package patterns.behavioural.mediator;

import lombok.Getter;

@Getter
public class EnglishInterface implements Mediator {

  private final Canadarm canadarm = new Canadarm();

  @Override
  public void extend() {
    canadarm.etendre();
  }

  @Override
  public void contract() {
    canadarm.contracter();
  }

  @Override
  public void grab() {
    canadarm.attraper();
  }
}