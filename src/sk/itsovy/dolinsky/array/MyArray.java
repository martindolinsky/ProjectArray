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

	/**
	 * Find arithmetic average number of array values
	 * find minimum and maximum value of array
	 * find second minimum and second maximum value of array
	 * print how many even and how many odd numbers are in array
	 */
	public static void test3() {
		System.out.println();

		Random rn = new Random();
		int[] arr = new int[12];

		for (int i = 0; i <= 11; i++) {
			arr[i] = rn.nextInt(90) + 10;
			System.out.print(arr[i] + " ");
		}

		int sum = 0;
		for (int i = 0; i < 12; i++) {
			sum += arr[i];
		}

		double average = sum / 12.0;
		System.out.println();
		System.out.println("Average: " + average);

		int min = arr[0];
		int second = arr[0];
		for (int i = 1; i < 12; i++) {
			if (min > arr[i])
				min = arr[i];
		}

		for (int i = 1; i < 11; i++) {
			if (arr[i] < min) {
				second = min;
				min = arr[i];
			} else if (arr[i] < second && arr[i] != min) {
				second = arr[i];
			}
		}
		System.out.println("SecondMinimum: " + second);
		System.out.println("Minimum: " + min);

		int max = arr[0];

		for (int i = 1; i < 12; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 1; i < 11; i++) {
			if (arr[i] > max) {
				second = max;
				max = arr[i];
			} else if (arr[i] > second && arr[i] != max) {
				second = arr[i];
			}
		}

		System.out.println("SecondMaximum: " + second);
		System.out.println("Maximum: " + max);

		int even = 0;
		int odd = 0;
		for (int i = 0; i < 12; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even: " + even + " Odd: " + odd);
	}

	/**
	 * Display fibonnaci sequence
	 */
	public static void test4() {
		System.out.println();
		int[] arr = new int[20];

		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < 20; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 0; i < 20; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] minmax(int a, int b, int c) {
		System.out.println();

		int[] result = new int[2];

		if (a <= b && a <= c) {
			result[0] = a;
		}
		if (b <= a && b <= c) {
			result[0] = b;
		}
		if (c <= a && c <= b) {
			result[0] = c;
		}
		if (a >= b && a >= c) {
			result[1] = a;
		}
		if (b >= a && b >= c) {
			result[1] = b;
		}
		if (c >= b && c >= a) {
			result[1] = c;
		}


		return result;

	}

}
