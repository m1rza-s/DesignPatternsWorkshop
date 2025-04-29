package patterns.structural.flyweight;

import lombok.Getter;
import patterns.creational.prototype.OrbiterMk2;

@Getter
public class DedicatedOrbiterMk2 extends OrbiterMk2 {
    private final String name;

    public DedicatedOrbiterMk2(String name) {
        this.name = name;
    }
}