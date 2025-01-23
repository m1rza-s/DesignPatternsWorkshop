package patterns.structural.adapter;

public interface Adapter {

  String translate(byte[] data);

  String translate(String data);
}