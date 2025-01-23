package patterns.structural.adapter;

public class FlipString implements Adapter {

  @Override
  public String translate(byte[] data) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String translate(String data) {
    StringBuilder builder = new StringBuilder();
    data.chars().forEach(c -> builder.insert(0, (char) c));
    return builder.toString();
  }
}