package patterns.structural.adapter;


public class EnglishCanadarm {

  private final Canadarm canadarm;

  public EnglishCanadarm(Canadarm canadarm) {
    this.canadarm = canadarm;
  }

  public String extend() {
    return "The Canadarm extends: (%s)".formatted(canadarm.etendre());
  }

  public String contract() {
    return "The Canadarm retracts: (%s)".formatted(canadarm.contracter());
  }

  public String grab() {
    return "The Canadarm grabs: (%s)".formatted(canadarm.attraper());
  }
}