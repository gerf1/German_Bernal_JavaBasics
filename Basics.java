import java.util.ArrayList;
public class Basics {
	public void print_1_to_255() {
		System.out.println("\nPrint 1-255\n");
		for (int i = 1; i <= 255; i++) {
			System.out.println(i);

		}

	}

	public void oddNumbers_1_to_255() {

		System.out.println("\nPrint odd numbers between 1-25\n");
		for (int i = 1; i <= 255; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

	public void Sum_1_to_255() {
		System.out.println("\nPrint Sum\n");
		int sum = 0;
		for (int i = 1; i <= 255; i++) {
			sum = sum + i;
			System.out.println("New number: " + i + " Sum: " + sum + "");

		}

	}

	public void interateArray(int[] arr) {
		System.out.println("\nIterating through an array\n");

		for (int num: arr) {
			System.out.println(num);
		}
	}

	public void findMax(int[] arr) {
		System.out.println("\nFind Max\n");

		int max = arr[0];
		for (int num: arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);

	}

	public void getAverage(int[] arr) {
		System.out.println("\nGet Average\n");

		int sum = 0;
		for (int num: arr) {
			sum += num;

		}
		System.out.println(sum / arr.length);

	}

	public ArrayList < Integer > arrayOddNumbers() {

		ArrayList < Integer > y = new ArrayList < Integer > ();
		System.out.println("\nArray with Odd Numbers\n");

		for (int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				y.add(i);
			}
		}
		return y;
	}

	public int greaterThanY(int[] arr, int y) {
		System.out.println("\nGreater Than Y\n");
		int count = 0;
		for (int num: arr) {
			if (num > y) {
				count++;
			}

		}

		return count;

	}

	public int[] squareValues(int[] arr) {
		System.out.println("\nSquare the values\n");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = arr[i] * arr[i];

		}
		return arr;
	}

	public int[] eliminateNegatives(int[] array) {
		System.out.println(" \nEliminate Negative Numbers\n");

		for (int i = 0; i < array.length; i++) {

			if (array[i] < 0) {
				array[i] = 0;
			}

		}

		return array;
	}

	public double[] maxMinAvg(int[] arr) {

		System.out.println(" \nMax, Min, and Average\n");

		double max = arr[0];
		double min = arr[0];
		double sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}
		double[] newarray = {
			max,
			min,
			sum / arr.length
		};
		return newarray;
	}
	public int[] shiftArray(int[] arr) {
		System.out.println(" \nShifting the Values in the Array\n");

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		return arr;
	}
}