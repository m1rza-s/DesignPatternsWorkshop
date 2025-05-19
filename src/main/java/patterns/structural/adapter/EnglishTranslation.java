package patterns.structural.adapter;

import lombok.Getter;

@Getter
public class EnglishTranslation {

  private final Canadarm canadarm = new Canadarm();

  public void extend() {
    canadarm.etendre();
  }

  public void contract() {
    canadarm.contracter();
  }

  public void grab() {
    canadarm.attraper();
  }
}