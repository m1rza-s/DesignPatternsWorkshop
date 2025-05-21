package patterns.structural.bridge;

public class OpticalSensor extends Sensor {

    public OpticalSensor() {
        super(new LowResolution());
    }


}