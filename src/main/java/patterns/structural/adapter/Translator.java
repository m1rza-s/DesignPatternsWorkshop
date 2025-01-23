package patterns.structural.adapter;

public class Translator {

  private Translator() {}

  public static String apply(Transformer t, byte[] data) {
    return t.translate(data);
  }

  public static String apply(Transformer t, String data) {
    return t.translate(data);
  }
}
