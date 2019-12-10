package sk.itsovy.dolinsky.devices;

/**
 * @author Martin Dolinsky
 */
public abstract class Device {
    private static int count;
    private String name;

    public Device(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}
