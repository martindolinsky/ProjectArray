package sk.itsovy.dolinsky.devices;

/**
 * @author Martin Dolinsky
 */
public class Mobile extends Device implements Movable {
    private double diagonal;

    public Mobile(String name, double diagonal) {
        super(name);
        this.diagonal = diagonal;
    }

    @Override
    public double getDiag() {
        return diagonal;
    }
}
