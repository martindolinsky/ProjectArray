package sk.itsovy.dolinsky.devices;

/**
 * @author Martin Dolinsky
 */
public class Notebook extends Computer implements Movable {
    private double diagonal;

    public Notebook(String name, String cpu, int ram, double diagonal) {
        super(name, cpu, ram);
        this.diagonal = diagonal;
    }

    @Override
    public double getDiag() {
        return diagonal;
    }
}
