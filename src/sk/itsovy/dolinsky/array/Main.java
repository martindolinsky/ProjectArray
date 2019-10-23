package sk.itsovy.dolinsky.array;


public class Main {

    public static void main(String[] args) {

        MyArray.test1();
        MyArray.test2();
        MyArray.test3();
        MyArray.test4();
        int[] results = MyArray.minmax(4, 2, 3);
        System.out.println(results[0] + " " + results[1]);
    }
}
