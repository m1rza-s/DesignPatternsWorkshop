package patterns.structural.adapter;

public interface Transformer {

  String translate(byte[] data);

  String translate(String data);
}
