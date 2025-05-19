package patterns.behavioural.mediator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Institution {

    protected ScienceApi api;
    protected String name;

    public Institution(ScienceApi api, String name) {
        this.api = api;
        this.name = name;
        this.api.register(this);
    }

    public void send(String data) {
        api.send(data);
    }

    public abstract void receive(String message);
}