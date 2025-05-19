package patterns.structural.facade;

public abstract class Check {
    protected boolean checkOK = false;
    abstract String verify();
}