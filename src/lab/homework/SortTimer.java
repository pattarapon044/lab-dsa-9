package lab.homework;

import java.util.Random;

import algorithm.Sort;

public class SortTimer {

	// new print() method
	private static void print(int[] a) {
		System.out.println("length= " + a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}

	// new main() method
	public static void main(String[] args) {
		// int[] data = {77,44,99,66,33,55,88,22};
		int MAX = 10000;
		Random rand = new Random();
		int[] data = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			data[i] = rand.nextInt(MAX) + 1;
		}
		System.out.println("Bubble Sort");
		print(data);

		// Algorithm Running Time (ms)
		long startTime = System.currentTimeMillis();
		
		Sort.bubbleSort(data);
		long endTime = System.currentTimeMillis();
		//

		print(data);
		System.out.println("Elapsed time = " + (endTime - startTime));
	}

}
