package sk.itsovy.dolinsky.array;

import java.util.Random;

/**
 * @author Martin Dolinsky
 */
public class MyArray {

	/**
	 * sout 7 1-digit numbers descending using array
	 */
	public static void test1() {
		System.out.println();

		int[] arr = new int[7];

		for (int i = 0; i <= 6; i++) {
			arr[i] = i + 1;
		}

		for (int i = 6; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * Generate 10 2-digit numbers and sout them ascending and descending using array
	 * sout only even numbers
	 */
	public static void test2() {
		System.out.println();

		Random rn = new Random();
		int[] arr = new int[10];

		for (int i = 0; i <= 9; i++) {
			arr[i] = rn.nextInt(90) + 10;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for (int i = 9; i >= 0; i--) {
			System.out.print(arr[i] + " ");

		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
