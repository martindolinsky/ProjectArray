package sk.itsovy.dolinsky.devices;

/**
 * @author Martin Dolinsky
 */
public class Computer extends Device implements Parameter {
    private String cpu;
    private int ram;

    public Computer(String name, String cpu, int ram) {
        super(name);
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    @Override
    public int getRam() {
        return ram;
    }

}
