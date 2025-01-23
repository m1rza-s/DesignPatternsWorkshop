package patterns.structural.adapter;

public class Stringer implements Transformer {

  @Override
  public String translate(byte[] data) {
    return new String(data);
  }

  @Override
  public String translate(String data) {
    return data;
  }
}
