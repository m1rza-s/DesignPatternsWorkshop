package patterns.behavioural.mediator;

import lombok.Getter;

@Getter
public class EnglishTranslation implements Translation {

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