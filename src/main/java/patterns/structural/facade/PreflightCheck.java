package patterns.structural.facade;

public abstract class PreflightCheck {
    protected boolean checkOK = false;
    abstract String verify();
}