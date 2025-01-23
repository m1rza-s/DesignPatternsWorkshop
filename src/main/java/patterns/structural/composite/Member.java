package patterns.structural.composite;

import space.Planet;

public interface Member {

    void explore(Planet planet);

    int count();
}
