package lab.homework;

public class BubbleSorting {
	// print() method
	private static void print(int[] a) {
		System.out.print("[");
		for (int i : a) {
			System.out.print(i);
			if (i == a[a.length-1])
				break;
			System.out.print(", ");
		}
		System.out.println("]");
	}

	// swap() method
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// bubbleSort() method
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j])
					swap(arr, j, j-1);
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 77, 44, 99, 66, 33, 55, 88, 22 };
		System.out.println("Bubble Sort");
		print(a);
		bubbleSort(a);
		print(a);
	}

}
