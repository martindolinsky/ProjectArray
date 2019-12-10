package sk.itsovy.dolinsky.devices;

/**
 * @author Martin Dolinsky
 */
public class Main {
    public static void main(String[] args) {

        Movable m1 = new Notebook("Lenovo 650c", "Intel i5", 2, 15.6);

        System.out.println("CPU: " + ((Notebook) m1).getCpu());

        Mobile m2 = new Mobile("Huawei \"P30\" Pro", 5.5);

        ((Device) m2).getName();
        System.out.println("Number of Devices: " + Device.getCount());

        Device d1;
        d1 = (Device) m1;

        Computer c1 = new Desktop("Dell 466", "AMD", 16, "BigTower");
        System.out.println("RAM: " + ((Parameter) c1).getRam());
        Object o1 = new Notebook("Acer 885", "AMD", 2, 14);
        Device[] arr = new Device[5];
        arr[0] = (Device) o1;
        arr[1] = (Device) m1;
        arr[2] = m2;
        arr[3] = c1;

        arr[4] = new Mobile("Samsung A80", 4.5);

        System.out.println();
        for (Device dev : arr) {
            if (dev instanceof Mobile) {
                System.out.println(dev.getName());
            }
        }

        Computer c2 = new Computer("IBM 1001", "Intel i9", 32);

        System.out.println();
        for (Device dev : arr) {
            if (dev instanceof Computer) {
                System.out.println(dev.getName());
            }
        }
    }
}
