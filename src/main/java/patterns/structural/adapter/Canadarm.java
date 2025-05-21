package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Canadarm {

  public String etendre() {
    return "Le Canadarm s’étend.";
    }

  public String contracter() {
    return "Le Canadarm se rétracte.";
    }

  public String attraper() {
    return "Le Canadarm saisit.";
    }

}