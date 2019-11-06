package sk.itsovy.dolinsky.project;

/**
 * @author Martin Dolinsky
 */
public interface ArrayMethods {

    public double getAverageValue();

    public int min();

    public int max();

    public int min2();

    public int max2();

    public void generateValues(int start, int end, boolean repeating);

    public boolean contains(int value);

    public int countOfValues(int value);

    public int countOfEvenValues();

    public void incrementValues();

    public void sort(boolean ascending);

    public void addItem(int newValue);

    public void addItem(int newValue, int position);

    public int[] copy();

    public int getItem(int position);


}
