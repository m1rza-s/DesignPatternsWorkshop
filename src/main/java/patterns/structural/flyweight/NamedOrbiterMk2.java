package patterns.structural.flyweight;

import lombok.Getter;
import patterns.creational.prototype.OrbiterMk2;

@Getter
public class NamedOrbiterMk2 extends OrbiterMk2 {
    private final String name;

    public NamedOrbiterMk2(String name) {
        this.name = name;
    }
}