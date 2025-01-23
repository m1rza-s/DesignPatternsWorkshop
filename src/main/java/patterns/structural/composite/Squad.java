package patterns.structural.composite;

import patterns.creational.prototype.Orbiter;
import patterns.structural.bridge.Rover;
import space.Planet;

import java.util.List;

public class Squad extends Wing {


    public Squad(List<Rover> rovers) {
        super(rovers);
    }

    @Override
    public void explore(Planet planet) {
        rovers.forEach(rover -> rover.doRove(planet));
    }

    @Override
    public int count() {
        return rovers.size();
    }
}
