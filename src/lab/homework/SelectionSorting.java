package lab.homework;

public class SelectionSorting {

	// print() method
	private static void print(int[] a) {
		System.out.print("[");
		for (int i : a) {
			System.out.print(i);
			if (i == a[a.length - 1])
				break;
			System.out.print(", ");
		}
		System.out.println("]");
	}

	// swap() method
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void selectionSort(int[] data) {
		int n = data.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (data[j] < data[min_idx])
					min_idx = j;

			swap(data, i, min_idx);
		}
	}

	public static void main(String[] args) {
		int[] data = { 77, 44, 99, 66, 33, 55, 88, 22 };
		System.out.println("Selection Sort");
		print(data);
		selectionSort(data);
		print(data);
	}

}
